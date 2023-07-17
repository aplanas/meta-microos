SUMMARY = "Steam Locomotive in ASCII art"
DESCRIPTION = "'sl' displays a steam locomotive running across the terminal. \
It is a joke command intended to catch any mistypings of 'ls'."
LICENSE = "ISC"

PV = "5.05"

RPM_NAME = "sl-5.05-1.1.aarch64.rpm"
RPM_HASH = "e859964896ce73a63aea7994b476712bd6bf65070fe1aedd97ea234a3eaf2b72df127ff4a1547fcad26a2b01a4a50435029f68ce5b37534a0e6a2d729e53f71f"

RPROVIDES:${PN} += "sl"

RDEPENDS:${PN} += "libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
