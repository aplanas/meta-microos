SUMMARY = "Table engine for fcitx"
DESCRIPTION = "Table engine for Fcitx input method framework. \
 \
It's the basic component for other users except some Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "215074bc39ffc812d4ffcec40af11082c61983182e0dd35143becdc1de9de83524ff4af9beb63618c5be123f2b552c2b24789bfa2a16b06b47521a5a6f893733"

RPROVIDES:${PN} += "fcitx-table"

RDEPENDS:${PN} += "fcitx \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
