SUMMARY = "Control X from the command line for scripts"
DESCRIPTION = "Control X from the command line for scripts, and do 'visual scraping' to find \
things on the screen. The conrol interface allows mouse movement, clicking, \
button up/down, key up/down, etc, and uses the XTest extension so you don't \
have the annoying problems that xse has when apps ignore sent events. The \
visgrep program find images inside of images and reports the coordinates, \
allowing programs to find buttons, etc, on the screen to click on."
LICENSE = "GPL-2.0+"

PV = "1.09"

RPM_NAME = "xautomation-1.09-1.28.aarch64.rpm"
RPM_HASH = "72036eaf63b561908c9892f21dc92b82c8407591bc2d7994345a135c2bd1980fe250ddc3f1122d1aadf28464799f2e65fc28748da8ac48b05241911fada094f8"

RPROVIDES:${PN} += "xautomation"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libpng16.so.16"

inherit rpm
