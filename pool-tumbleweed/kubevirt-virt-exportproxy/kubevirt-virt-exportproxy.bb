SUMMARY = "Export proxy for kubevirt"
DESCRIPTION = "The virt-exportproxy package provides a proxy for kubevirt to pass \
requests to virt-exportserver"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-exportproxy-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "f10a5bb0f4d6832f3f4d1cdaa5caaa7bd6df4e8c6960f695b25632270fa2fd7f2da8b9c7cd750a131bc1f2beddb5db9f77f0cb92729632f94251eedc5b6c0045"

RPROVIDES:${PN} += "kubevirt-virt-exportproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
