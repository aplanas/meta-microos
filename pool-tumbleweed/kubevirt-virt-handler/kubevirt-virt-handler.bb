SUMMARY = "Handler component for kubevirt"
DESCRIPTION = "The virt-handler package provides a handler for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-handler-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "b95bdd143a881f4369d655ab59172af99b023b7df1b1996ad8e495039e577b69ad54f482e1f96b8a0d0fb429bb83ebf2a813d3d0398bb2ffbbd6789a8b2fa47c"

RPROVIDES:${PN} += "kubevirt-virt-handler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
