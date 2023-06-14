SUMMARY = "Development Library and Header Files for FreeWnn"
DESCRIPTION = "This package contains the header files and libraries for building \
client programs which use FreeWnn for Japanese input."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fwnn-devel-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "ea52e321780aef971190b03883c4c6a2258268135f263dae2208dc69c2f2067826d6d64307bcc5d8be022612387cc65cbdba0bb10b899a1ac341660a46fcda41"

RPROVIDES:${PN} += "fwnn-devel \
fwnndev"

RDEPENDS:${PN} += "fcwnn-devel \
fwnn \
libjd0 \
libwnn0"

inherit rpm
