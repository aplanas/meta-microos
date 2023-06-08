SUMMARY = "Header files for fifechan"
DESCRIPTION = "Development files, such as headers, needed when building packages using fifechan."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "fifechan-devel-0.1.5-1.19.aarch64.rpm"
RPM_HASH = "cbf91d7ed5913e2ffeb0bf4115a2565ca62b2065270598d88e2ea279cc8b04c832540c365e04c579bfdc3e0297763751796893d6ea698a2752675189603c7314"

RPROVIDES:${PN} += "fifechan-devel fifechan-devel(aarch-64)"
RDEPENDS:${PN} += "libfifechan0_1_5 libfifechan_opengl0_1_5 libfifechan_sdl0_1_5"

inherit rpm
