SUMMARY = "Libyui - tools for the NCurses (text based) user interface"
DESCRIPTION = "This package contains tools for the NCurses (text based) \
user interface component for libyui: \
 \
libyui-terminal - useful for testing on headless machines"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-ncurses-tools-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "8212b01cbc936be367d4c117fa76d49101124bd0965f33196abf7b8eddb468378030c9b212de9cbe891be24819579466b1904451d191e3faf4de3ac2be680074"

RPROVIDES:${PN} += "libyui-ncurses-tools"

RDEPENDS:${PN} += "/bin/sh \
screen"

inherit rpm
