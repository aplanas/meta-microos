SUMMARY = "Table engine for fcitx"
DESCRIPTION = "Table engine for Fcitx input method framework. \
 \
It's the basic component for other users except some Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "1198352cf0de706d72dbc677d4b8a0f24bcf75d0603cd46b08dd52fd15d1a1171ddc7a03718a220fe71c85b01bde1bfb719c7ed60c68ebd553f80ba9dec40d1e"

RPROVIDES:${PN} += "fcitx-table"

RDEPENDS:${PN} += "fcitx \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
