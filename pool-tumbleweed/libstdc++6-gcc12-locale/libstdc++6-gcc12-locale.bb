SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libstdc++6-gcc12-locale-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "026f686bc5c22d2b63c4127606a20399fe3a68218d520a1e93851a0d0da1adc5a253c2590158c9d3fe95daa5f6de641c1e4ca5ff7b35969af54ea3f795a87984"

RPROVIDES:${PN} += "libstdc++6-gcc12-locale \
libstdc++6-gcc12-locale(aarch-64) \
libstdc++6-locale \
locale(libstdc++6-gcc12:de) \
locale(libstdc++6-gcc12:fr)"

RDEPENDS:${PN} += ""

inherit rpm
