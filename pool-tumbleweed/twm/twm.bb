SUMMARY = "Tab Window Manager for the X Window System"
DESCRIPTION = "twm is a window manager for the X Window System. It provides \
titlebars, shaped windows, several forms of icon management, \
user-defined macro functions, click-to-type and pointer-driven \
keyboard focus, and user-specified key and pointer button bindings."
LICENSE = "HPND"

PV = "1.0.12"

RPM_NAME = "twm-1.0.12-1.6.aarch64.rpm"
RPM_HASH = "d5b140f3e29f471b11d5c627f59411cf6a38b39b9b95cd527c75b83b3421eb20268fa42a2ceb4101943b318931f0e8b36ec7b0f3e4af789ba0eca0196a528e43"

RPROVIDES:${PN} += "twm \
twm(aarch-64) \
windowmanager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
