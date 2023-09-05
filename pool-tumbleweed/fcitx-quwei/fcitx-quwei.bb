SUMMARY = "Chinese Zone-bit(QuWei) engine for fcitx"
DESCRIPTION = "Chinese Zone-bit(QuWei) engine for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-quwei-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "dde10d99c1ce9243da62a1886058821dfbc7295dc7cc9c0225b6ca6962e7527e396279c2407fa0d5f651b4d10dc4605d8330d4fe5f513d0aff7e963548865e5d"

RPROVIDES:${PN} += "fcitx-quwei"

RDEPENDS:${PN} += "fcitx \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
