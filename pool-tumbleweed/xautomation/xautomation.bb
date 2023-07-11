SUMMARY = "Control X from the command line for scripts"
DESCRIPTION = "Control X from the command line for scripts, and do 'visual scraping' to find \
things on the screen. The conrol interface allows mouse movement, clicking, \
button up/down, key up/down, etc, and uses the XTest extension so you don't \
have the annoying problems that xse has when apps ignore sent events. The \
visgrep program find images inside of images and reports the coordinates, \
allowing programs to find buttons, etc, on the screen to click on."
LICENSE = "GPL-2.0+"

PV = "1.09"

RPM_NAME = "xautomation-1.09-1.29.aarch64.rpm"
RPM_HASH = "3b931385339daafac52bcd6b4c9a19511af773ac71a030493abd37de242ad871d12a2437975b7907de466bcbf59b3758a614e7f48cc0c6060bbe62b393b83d4d"

RPROVIDES:${PN} += "xautomation"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libpng16.so.16"

inherit rpm
