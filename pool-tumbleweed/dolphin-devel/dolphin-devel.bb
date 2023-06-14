SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "dolphin-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c5e8513b046cbfd7a65a68b8ae9d6697cd04fcecbefaf62d719cea7e4897ab74fa4bc5b41dbad84772c1e00c2779e0c0863dbbd4079ab755c1b474ef6f8a5941"

RPROVIDES:${PN} += "cmake-DolphinVcs \
dolphin-devel \
dolphin5-devel"

RDEPENDS:${PN} += "libdolphinvcs5"

inherit rpm
