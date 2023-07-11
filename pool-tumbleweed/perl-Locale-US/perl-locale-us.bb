SUMMARY = "Two letter codes for state identification in the United States and vice versa"
DESCRIPTION = "Two letter codes for state identification in the United States and vice versa."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "3.04"

RPM_NAME = "perl-Locale-US-3.04-1.27.noarch.rpm"
RPM_HASH = "e495c03dc771a40edb462c45fd1330ec62b3a10b6972bf0a02ca22e47d43cf42a84fa00cae138af5c944ede4b9d6e94d55c6644a1825d3576dcccb91b1e8f3fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Locale--US \
perl-Locale-US"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--Section--Simple"

inherit rpm
