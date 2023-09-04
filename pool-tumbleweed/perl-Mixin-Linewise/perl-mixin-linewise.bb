SUMMARY = "Write your linewise code for handles; this does the rest"
DESCRIPTION = "It's boring to deal with opening files for IO, converting strings to \
handle-like objects, and all that. With Mixin::Linewise::Readers and \
Mixin::Linewise::Writers, you can just write a method to handle handles, \
and methods for handling strings and filenames are added for you."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.111"

RPM_NAME = "perl-Mixin-Linewise-0.111-1.4.noarch.rpm"
RPM_HASH = "be29f27d5246d96dea123ceff0b66567f8fea5cf875b143f544c2af57d905ef89baef6aef32634600ad140210c3ad88d6b11e363e63c2499e347ba9f728673f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mixin--Linewise \
perl-Mixin--Linewise--Readers \
perl-Mixin--Linewise--Writers \
perl-Mixin-Linewise"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-PerlIO--utf8-strict \
perl-Sub--Exporter"

inherit rpm
