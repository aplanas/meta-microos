SUMMARY = "Write your linewise code for handles; this does the rest"
DESCRIPTION = "It's boring to deal with opening files for IO, converting strings to \
handle-like objects, and all that. With Mixin::Linewise::Readers and \
Mixin::Linewise::Writers, you can just write a method to handle handles, \
and methods for handling strings and filenames are added for you."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.111"

RPM_NAME = "perl-Mixin-Linewise-0.111-1.2.noarch.rpm"
RPM_HASH = "aa6f5e36667e0aaf8bc9cde80afc9104c8f13681c9e8f86d5ecbd69f26f642476753e6192f9d5e3ee73149195be6b078eeadfc72c3af18d920c0ece600bdc8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mixin--Linewise \
perl-Mixin--Linewise--Readers \
perl-Mixin--Linewise--Writers \
perl-Mixin-Linewise"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-PerlIO--utf8-strict \
perl-Sub--Exporter"

inherit rpm
