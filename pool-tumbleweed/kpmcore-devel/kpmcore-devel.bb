SUMMARY = "Development package for KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects. \
 \
Development package for kpmcore."
LICENSE = "GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "kpmcore-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "891e958b2f09991c854b96bc0a821262639271f7cd2a2410a67b7f14ff5bf96aae31810adbb928a75679870121221ec16a6b430138b4dbed13f6d8b93f6e65fc"

RPROVIDES:${PN} += "cmake(KPMcore) \
kpmcore-devel \
kpmcore-devel(aarch-64)"

RDEPENDS:${PN} += "libkpmcore12"

inherit rpm
