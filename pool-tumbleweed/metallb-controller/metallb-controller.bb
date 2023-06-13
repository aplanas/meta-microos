SUMMARY = "MetalLB controller binary"
DESCRIPTION = "MetalLB is a load-balancer implementation for bare metal Kubernetes clusters, using standard routing protocols. \
This package contains the controller binary."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "metallb-controller-0.9.5-1.13.aarch64.rpm"
RPM_HASH = "7729227c6589239ff6e034a51fd6bc3765dcc7128a01e22da35c3df3c4313b8e52a060a439d9f3855866554469aa7e645ea35fb9460c8e5810a9648fa7cec053"

RPROVIDES:${PN} += "metallb-controller \
metallb-controller(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
