SUMMARY = "Files for Developing with lpsolve"
DESCRIPTION = "Includes and definitions for developing with the lpsolve library."
LICENSE = "LGPL-2.0+"

PV = "5.5.2.0"

RPM_NAME = "lpsolve-devel-5.5.2.0-10.28.aarch64.rpm"
RPM_HASH = "ab6ac160f8c8f443e0c4b57f8f738ba0a3de9b6f608f533e6f02d6e6d3e1a366ccaf6b4514bd2aa8b9a7b3bfc80e09a57adc5dc9478b3c0d8a207256f5e4c4ad"

RPROVIDES:${PN} += "lpsolve-devel \
lpsolve-devel(aarch-64)"

RDEPENDS:${PN} += "liblpsolve55-0"

inherit rpm
