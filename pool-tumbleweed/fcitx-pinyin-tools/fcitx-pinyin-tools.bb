SUMMARY = "Fcitx tools to make pinyin match list"
DESCRIPTION = "Tools to convert txt or scel(sougou pinyin data format) pinyin sheets to fcitx match lists."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-pinyin-tools-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "cdcdf902225a719deb28910d8903f774804298546bd8596e9511b2fc06e2f021a4e549a4d7d260141f331b77d65eb10c5a2f03e15211647b78a9d37be30d841d"

RPROVIDES:${PN} += "fcitx-pinyin-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-utils.so.0"

inherit rpm
