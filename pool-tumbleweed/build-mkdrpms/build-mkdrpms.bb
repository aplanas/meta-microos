SUMMARY = "Tools to generate delta rpms"
DESCRIPTION = "This package contains the parts which may be installed in the inner build system \
for generating delta rpm packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230628"

RPM_NAME = "build-mkdrpms-20230628-1.1.noarch.rpm"
RPM_HASH = "ab1d747fd0b7887a1abe9871ad2e3fa53df516d328d0c2a2a6013f7110588bbafbb7821e024ec42cdae6045dd87c626a872b8579a26766651d77295370c515e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-mkdrpms"

RDEPENDS:${PN} += "/usr/bin/perl \
build \
deltarpm"

inherit rpm
