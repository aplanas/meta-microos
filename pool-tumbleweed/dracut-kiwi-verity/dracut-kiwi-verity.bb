SUMMARY = "KIWI - Dracut module for disk with embedded verity metadata"
DESCRIPTION = "This package contains the kiwi-verity dracut module which is used \
for booting oem images built with KIWI and configured to use an \
embedded verity metadata block via the embed_verity_metadata \
type attribute"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-verity-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "68fa06ee4700d2196186518ed3d08f82ffe59b243c04307b49db1085cc4bada93478f33ff4f00974c3f9bcf66bdb76d98dc24411779d69e836132558df0738df"

RPROVIDES:${PN} += "dracut-kiwi-verity \
dracut-kiwi-verity(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
dracut \
dracut-kiwi-lib \
libc.so.6()(64bit)"

inherit rpm
