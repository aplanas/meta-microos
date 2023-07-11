SUMMARY = "Write your linewise code for handles; this does the rest"
DESCRIPTION = "It's boring to deal with opening files for IO, converting strings to \
handle-like objects, and all that. With Mixin::Linewise::Readers and \
Mixin::Linewise::Writers, you can just write a method to handle handles, \
and methods for handling strings and filenames are added for you."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.111"

RPM_NAME = "perl-Mixin-Linewise-0.111-1.3.noarch.rpm"
RPM_HASH = "7884e5bc9ca4029274820ebba5c259fe631a6de5590e32198b5efdb890485ec4f879f031d5d4c1a51e17e059f8bb83c192ad3b0dae9241795d4a90a4b607f93a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mixin--Linewise \
perl-Mixin--Linewise--Readers \
perl-Mixin--Linewise--Writers \
perl-Mixin-Linewise"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-PerlIO--utf8-strict \
perl-Sub--Exporter"

inherit rpm
