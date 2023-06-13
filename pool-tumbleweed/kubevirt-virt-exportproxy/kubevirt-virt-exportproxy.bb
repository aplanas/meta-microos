SUMMARY = "Export proxy for kubevirt"
DESCRIPTION = "The virt-exportproxy package provides a proxy for kubevirt to pass \
requests to virt-exportserver"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-exportproxy-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "6f23eb3e841cf0568a4e62ee759a7282bc819dfea0d0e74564c3a17ecc15a1a02e9b4612ea253d00da9792658c933df8530032bff7bbd28330cb266e89a1f544"

RPROVIDES:${PN} += "kubevirt-virt-exportproxy \
kubevirt-virt-exportproxy(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
