SUMMARY = "Stringprep Profile for Internationalized Domain Names (RFC 3491)"
DESCRIPTION = "This module implements the _nameprep_ specification, which describes how to \
prepare internationalized domain name (IDN) labels in order to increase the \
likelihood that name input and name comparison work in ways that make sense \
for typical users throughout the world. Nameprep is a profile of the \
stringprep protocol and is used as part of a suite of on-the-wire protocols \
for internationalizing the Domain Name System (DNS)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.102"

RPM_NAME = "perl-Net-IDN-Nameprep-1.102-2.16.noarch.rpm"
RPM_HASH = "a358b16dad482eff2bd083aced84af19468febbc699ca47dbea24f2db0b3e7cbf8b1c85ad7deedcce6cd65adbe49023e5d7356474e36c823e0423fc6584f5761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--IDN--Nameprep \
perl-Net-IDN-Nameprep"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Unicode--Stringprep"

inherit rpm
