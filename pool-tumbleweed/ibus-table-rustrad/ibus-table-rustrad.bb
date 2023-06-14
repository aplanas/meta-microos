SUMMARY = "Rustrad input method for IBus framework"
DESCRIPTION = "ibus-table-rustrad provides Rustrad input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-rustrad-1.3.13-2.3.noarch.rpm"
RPM_HASH = "38f1983278437767a8a8d5e8b37fefa2dc0d14ce7ca4b3ff6abf03c744ad26a5ac40aa130f7e5098e55c442db9b763086fa3393f8d1076531fbedf6cb9f9ff0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-rustrad \
locale-ibus-ru"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
