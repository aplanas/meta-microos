SUMMARY = "Development files for Osmocom's Media Gateway server library"
DESCRIPTION = "Osmocom's Media Gateway Control Protocol server library. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-mgcp."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "libosmo-mgcp-devel-1.9.0-1.10.aarch64.rpm"
RPM_HASH = "11b85ce9eabdad8ddb99769c6400f25b8fa78dce24dbb556073fe255262ef5784df12b9703b4b3a24d642b05da003c8997cc9772be64131a0deb27de3b8e4ed8"

RPROVIDES:${PN} += "libosmo-mgcp-devel"

RDEPENDS:${PN} += ""

inherit rpm
