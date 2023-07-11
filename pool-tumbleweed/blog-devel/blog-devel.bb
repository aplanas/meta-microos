SUMMARY = "Provides library and header for boot logging"
DESCRIPTION = "The libaray and the header file for the FIFO interface used to build \
the LSB startproc command."
LICENSE = "GPL-2.0-or-later"

PV = "2.26"

RPM_NAME = "blog-devel-2.26-2.3.aarch64.rpm"
RPM_HASH = "dc4c553a12d0014aed6fe0e2c9bbc6ae30a8976f2352bff11257a362d155ecf5b62f0c2ef5d49ddb90408d47d612efc54bb3765dfac29a200967fdfa1e080bac"

RPROVIDES:${PN} += "blog-devel"

RDEPENDS:${PN} += "libblogger2"

inherit rpm
