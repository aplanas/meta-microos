SUMMARY = "Data files for libimagevisualresult"
DESCRIPTION = "The package provides date for Deepin Image editor."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "libimagevisualresult-data-1.0.24-1.1.aarch64.rpm"
RPM_HASH = "4938991b25bbf4919ad2afccbfa4ee70bb00d78a56180b36b900436503cd5ebca1f2615cc2a78e1e14d60194a6f3aed3415301671a42ea8c56ac8f7bb302ea0e"

RPROVIDES:${PN} += "libimagevisualresult-data \
libimagevisualresult-data(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
