SUMMARY = "Collection of day-to-day tools (data)"
DESCRIPTION = "Architecture-independent data from hxtools. \
 \
* VAIO U3 keymap \
* additional fonts for console and xterm \
* additional syntax highlighting definitions for mcedit"
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "hxtools-data-20230411-1.1.noarch.rpm"
RPM_HASH = "73564400edd3fac4f233976398a2c0c07eaee9d0cdd1e0e1cae1dcc008d01e19a739205ab3ceedba72fe8cbfc847f010969d37d506a079088e8a3a03560e0894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(hxtools-data) \
hxtools-data"

RDEPENDS:${PN} += ""

inherit rpm
