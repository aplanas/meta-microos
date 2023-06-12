SUMMARY = "Data Plane Development Kit API documentation"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-doc-22.11.1-2.4.noarch.rpm"
RPM_HASH = "ba594b6d35721c34a856dfd61361f6f2fe4a3311dec0b35b49f5f8e829468d1333107d025098a0a985758ae5f8dd502925060fc5401714bce9244038da42e073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-doc"
RDEPENDS:${PN} += ""

inherit rpm
