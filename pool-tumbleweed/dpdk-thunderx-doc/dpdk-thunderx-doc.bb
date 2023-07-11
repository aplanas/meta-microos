SUMMARY = "Data Plane Development Kit API documentation (thunderx)"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-doc-22.11.1-2.8.noarch.rpm"
RPM_HASH = "7f1fd337ffcc7e17d6c3a16174145da50dbef02df31517dfde99d1e98bb4d292055b7242afea03232937a2d95ffb772d5d60a856b98d4cb7baea0d4c734960e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-thunderx-doc"

RDEPENDS:${PN} += ""

inherit rpm
