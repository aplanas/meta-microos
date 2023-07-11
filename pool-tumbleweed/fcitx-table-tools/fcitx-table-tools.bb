SUMMARY = "Fcitx tools to make tables"
DESCRIPTION = "Tools to convert txt word sheets to fcitx tables. \
 \
see manpage for details"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-tools-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "11d2b0651e972aa931d01a9dce3fdb29e61d3110de6e2ec923000414de23025154f83ee7494f6e51eeab07b95c73fb9e39d6bdc28eabd3d2e14db328b7aceb17"

RPROVIDES:${PN} += "fcitx-table-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-utils.so.0"

inherit rpm
