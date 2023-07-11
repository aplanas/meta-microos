SUMMARY = "General Purpose C++ Runtime System"
DESCRIPTION = "HPX is a general purpose C++ runtime system for parallel and distributed applications of any scale."
LICENSE = "BSL-1.0"

PV = "1.8.1"

RPM_NAME = "hpx-1.8.1-2.4.aarch64.rpm"
RPM_HASH = "37fe2fddbc5461e07deaffa889ca45edb199b9c9e71575e4bf5e0f53f7037853880ccb421284efac38a01a6116a337f202bbcb2a199186beabff015f1aef95ce"

RPROVIDES:${PN} += "hpx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
libhpx1"

inherit rpm
