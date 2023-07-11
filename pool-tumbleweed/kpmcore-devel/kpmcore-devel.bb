SUMMARY = "Development package for KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects. \
 \
Development package for kpmcore."
LICENSE = "GPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "kpmcore-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "315ad113605f89d71a1bb46941dd19e202265fcc437217798cf23ea5c3d919a6899e04fb1ac0da12cd554009c4223efcc8e896a3a11eb2ef0677ed8158a8fbaf"

RPROVIDES:${PN} += "cmake-KPMcore \
kpmcore-devel"

RDEPENDS:${PN} += "libkpmcore12"

inherit rpm
