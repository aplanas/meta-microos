SUMMARY = "Stringprep Profile for Internationalized Domain Names (RFC 3491)"
DESCRIPTION = "This module implements the _nameprep_ specification, which describes how to \
prepare internationalized domain name (IDN) labels in order to increase the \
likelihood that name input and name comparison work in ways that make sense \
for typical users throughout the world. Nameprep is a profile of the \
stringprep protocol and is used as part of a suite of on-the-wire protocols \
for internationalizing the Domain Name System (DNS)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.102"

RPM_NAME = "perl-Net-IDN-Nameprep-1.102-2.15.noarch.rpm"
RPM_HASH = "f56d7175863addf77c598eff474e8a5621dac98a66e7691b202e6f4b2dc10847381ab7cf42691df6367f700a05581595630f180270ea12b183b90ab77215a207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--IDN--Nameprep \
perl-Net-IDN-Nameprep"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Unicode--Stringprep"

inherit rpm
