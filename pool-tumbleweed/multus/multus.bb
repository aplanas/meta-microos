SUMMARY = "CNI plugin providing multiple interfaces in containers"
DESCRIPTION = "Multus is a CNI plugin which provides multiple network interfaces in \
containers. It allows to use many CNI plugins at the same time and supports all \
plugins which implement the CNI specification."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "multus-3.6-1.10.aarch64.rpm"
RPM_HASH = "a79f479ae9b5d331985a8fad10870a529a9ee0e54323b64fe8384bec0efee4049468b57cd49ea4e229ac2aba58be672f645ee506ebb37df77ff8e8962b0f3c6e"

RPROVIDES:${PN} += "multus"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
