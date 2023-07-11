SUMMARY = "Development files for libturris-spectator"
DESCRIPTION = "The libturris-spectator-devel package contains libraries and header files for \
developing applications that use libturris-spectator."
LICENSE = "GPL-3.0+"

PV = "0.6+git74.9ef0de5"

RPM_NAME = "libturris-spectator-devel-0.6+git74.9ef0de5-1.28.aarch64.rpm"
RPM_HASH = "491517525d86710cad97c063d24fe87ea399a87ed7e9e780ddc5b4f0763c315d263815be00d1617283f762658f78bb4fe79b198f704d9a6a396a807599de978c"

RPROVIDES:${PN} += "libturris-spectator-devel"

RDEPENDS:${PN} += "libturris-spectator0"

inherit rpm
