SUMMARY = "Development files for Osmocom's Media Gateway server library"
DESCRIPTION = "Osmocom's Media Gateway Control Protocol server library. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-mgcp."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "libosmo-mgcp-devel-1.9.0-1.11.aarch64.rpm"
RPM_HASH = "49206187dfe0e51adfd6478269c8e9ed6436d36ebefe2b1c26ff62345ffbf514ce779ec6d770c82ac978d36d228fffc5df2bccbad64899296b45632eda2a8a38"

RPROVIDES:${PN} += "libosmo-mgcp-devel"

RDEPENDS:${PN} += ""

inherit rpm
