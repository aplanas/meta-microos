SUMMARY = "Development tools for docparser"
DESCRIPTION = "The docparser-devel package contains the header files and developer docs for \
docparser."
LICENSE = "GPL-3.0+"

PV = "1.0.1"

RPM_NAME = "docparser-devel-1.0.1-1.8.aarch64.rpm"
RPM_HASH = "0343cc333b92e0416df8b076c2e80d8c8c9277cb1f2e5fd5857ec3e3d43682c79d4302c5a1b2de00a1c8eb3ee47d6b7690f3ea7cf5838d62a7a28b057b0792ed"

RPROVIDES:${PN} += "docparser-devel \
pkgconfig-docparser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdocparser1"

inherit rpm
