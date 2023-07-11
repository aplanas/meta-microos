SUMMARY = "A command line interface tasks manager"
DESCRIPTION = "TuDu is a command line interface to manage hierchical todos. \
Each task has a title and description, a deadline and scheduled date as well \
as categories and priorities."
LICENSE = "GPL-3.0-only"

PV = "0.10.4"

RPM_NAME = "tudu-0.10.4-1.12.aarch64.rpm"
RPM_HASH = "16fe64eeebcc76abb3f8c19a1660880c38f1228190c048a4be44177ede469f5fdb965a94c8975792586c39f248dd3b9f7aa2f431cdc00f036d807f4c02e44bbb"

RPROVIDES:${PN} += "config-tudu \
tudu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
