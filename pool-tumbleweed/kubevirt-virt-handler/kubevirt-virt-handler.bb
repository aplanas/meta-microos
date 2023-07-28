SUMMARY = "Handler component for kubevirt"
DESCRIPTION = "The virt-handler package provides a handler for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-handler-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "1d92fe5d25aba681fce7e3d64d30fe35af66d42498bbf793bb12e7353dac9652cb49741ba3ca22c5c1184bfce18486db33f5c8f6382234ab338e0a98f8ea87c3"

RPROVIDES:${PN} += "kubevirt-virt-handler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
