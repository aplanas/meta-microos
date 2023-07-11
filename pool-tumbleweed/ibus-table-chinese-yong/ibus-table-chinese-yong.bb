SUMMARY = "YongMa input method"
DESCRIPTION = "YongMa input method."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-yong-1.8.12-1.2.noarch.rpm"
RPM_HASH = "f6e347dd02170e81e8572968af7ed5834cce8c367893a9d078f820b4b8bf4ae0026efeca88084975c912cb3fe4fb6d14aecce2b924d8c9895d3c11cb2ebe2a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-yong \
ibus-table-yong \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
