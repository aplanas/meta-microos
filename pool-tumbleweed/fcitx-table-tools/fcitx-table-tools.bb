SUMMARY = "Fcitx tools to make tables"
DESCRIPTION = "Tools to convert txt word sheets to fcitx tables. \
 \
see manpage for details"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-tools-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "4496de78ca6ba71c88a4b7f313124133bf17aab9f0bf05acb88107d8b11a70730a1537918b5617814d5646d420d8d0ddc682c13a87d8ebdba15df3bec0a60d29"

RPROVIDES:${PN} += "fcitx-table-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-utils.so.0"

inherit rpm
