SUMMARY = "Collection of day-to-day tools (data)"
DESCRIPTION = "Architecture-independent data from hxtools. \
 \
* VAIO U3 keymap \
* additional fonts for console and xterm \
* additional syntax highlighting definitions for mcedit"
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "hxtools-data-20230411-1.2.noarch.rpm"
RPM_HASH = "0180d5cff88f9157b0b1ee3e662223e0474c9f556125a3228c2c51bef24ea391f1146ea6175714fcac7f1d638d4ca77df4d5490b3fa1d923769afe1cb0996639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-hxtools-data \
hxtools-data"

RDEPENDS:${PN} += ""

inherit rpm
