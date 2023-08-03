SUMMARY = "Export proxy for kubevirt"
DESCRIPTION = "The virt-exportproxy package provides a proxy for kubevirt to pass \
requests to virt-exportserver"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-exportproxy-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "c2f845894a9239446535e65b4d1366e7de87c90f763f592ed3e5535a96f06036c83017ff9826492298af8e8c9c1aed4c019bdb330cdcdc46448d0f33a4687915"

RPROVIDES:${PN} += "kubevirt-virt-exportproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
