SUMMARY = "Export proxy for kubevirt"
DESCRIPTION = "The virt-exportproxy package provides a proxy for kubevirt to pass \
requests to virt-exportserver"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-exportproxy-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "681e163b69135425558b685702e66ed7e2a2130ac7ca43be3124dee0b80be0554b8cc1f0116d7a58045787c842689a770740da8781a14d648adf97f594864fe4"

RPROVIDES:${PN} += "kubevirt-virt-exportproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
