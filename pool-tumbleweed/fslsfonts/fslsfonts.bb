SUMMARY = "Utility to list fonts served by X font server"
DESCRIPTION = "fslsfonts lists the fonts that match the given pattern."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "fslsfonts-1.0.6-1.3.aarch64.rpm"
RPM_HASH = "92269f89a8e200da0e0d7e2932b5d639036e1719d4b47adea0c49a3f8a2440cd040108bad1c1dd7f5b8dfc8acefd6058ebe6c56d7f67e2a21102205b7c6f5e8e"

RPROVIDES:${PN} += "fslsfonts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFS.so.6 \
libc.so.6"

inherit rpm
