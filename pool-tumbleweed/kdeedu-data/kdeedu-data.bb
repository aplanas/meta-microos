SUMMARY = "Data files for KDE Education Applications"
DESCRIPTION = "This package contains common data files used by various KDE education \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdeedu-data-23.04.3-1.1.noarch.rpm"
RPM_HASH = "97a4180cefda6446bd75d71ec45537131181d0c68cf125544e922c126c586af205ce03c73f7c09ac6a1527728ccc877a93ac6c0050238bb8c401160d5ce3da84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeedu-data \
libkdeedu4-data \
libkeduvocdocument-data"

RDEPENDS:${PN} += ""

inherit rpm
