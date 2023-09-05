SUMMARY = "Development files for kiten"
DESCRIPTION = "Kiten is a tool to learn Japanese. \
 \
This package contains files for developing applications using kiten."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kiten-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "387e2c6680e3e694515a6a7eac0d547a767d181a51fc9956cf4b64ac0b95adeecac2337fc821e5507f02cdd1c4779ceb5dd135957451b89c627621fc5dbee03d"

RPROVIDES:${PN} += "kiten-devel"

RDEPENDS:${PN} += "kiten"

inherit rpm
