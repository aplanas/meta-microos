SUMMARY = "Table engine for fcitx"
DESCRIPTION = "Table engine for Fcitx input method framework. \
 \
It's the basic component for other users except some Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "f28af6c95f61e35f74cd208a534d61b8c54e474a2753c6a82ddc87668a7d0424a5c2a1310f1f130a5d1f7d4a6aa6db2af0009daddf4d7fc7c60486d8fdcf0de2"

RPROVIDES:${PN} += "fcitx-table fcitx-table(aarch-64)"
RDEPENDS:${PN} += "fcitx ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
