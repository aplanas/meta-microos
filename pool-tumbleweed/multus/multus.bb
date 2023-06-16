SUMMARY = "CNI plugin providing multiple interfaces in containers"
DESCRIPTION = "Multus is a CNI plugin which provides multiple network interfaces in \
containers. It allows to use many CNI plugins at the same time and supports all \
plugins which implement the CNI specification."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "multus-3.6-1.9.aarch64.rpm"
RPM_HASH = "c16055efa72045e91514b8758ab33ec57aa53b992bcb7011084e25c0d69b1524a630964547a4511fb7837b54d1921d8c966358047ca5113f188db9568e867871"

RPROVIDES:${PN} += "multus"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
