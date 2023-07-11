SUMMARY = "Export proxy for kubevirt"
DESCRIPTION = "The virt-exportproxy package provides a proxy for kubevirt to pass \
requests to virt-exportserver"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-exportproxy-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "7aa794d69415b1d557d4f0a54ef05f5fb530402f2ad8c7ad30a22805e76daa4d938e63a852e3932aa23f9cc70d908d77864318321f033be0e42f29523a058daf"

RPROVIDES:${PN} += "kubevirt-virt-exportproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
