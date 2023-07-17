SUMMARY = "Export proxy for kubevirt"
DESCRIPTION = "The virt-exportproxy package provides a proxy for kubevirt to pass \
requests to virt-exportserver"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-exportproxy-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "11d8c7dfb8f020e67c1944eecf019989e448680cfb8d373e6fb2a265dadaae84501a2748e1f5e0767ca8e17bf6599c79aafa263f34fd71dc8fcac321ddc32cf7"

RPROVIDES:${PN} += "kubevirt-virt-exportproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
