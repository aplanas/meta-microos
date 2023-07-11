SUMMARY = "MetalLB controller binary"
DESCRIPTION = "MetalLB is a load-balancer implementation for bare metal Kubernetes clusters, using standard routing protocols. \
This package contains the controller binary."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "metallb-controller-0.9.5-1.14.aarch64.rpm"
RPM_HASH = "88f541d736adc0144dfda8ba7ee262c09272a30fd869aa2f9fa21facf89ef06bfed830340fa1b4bd51dbbbe2a46c15fe0746b825848846255d4fe434c10e3c57"

RPROVIDES:${PN} += "metallb-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
