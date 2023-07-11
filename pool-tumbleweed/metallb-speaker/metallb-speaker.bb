SUMMARY = "MetalLB speaker binary"
DESCRIPTION = "MetalLB is a load-balancer implementation for bare metal Kubernetes clusters, using standard routing protocols. \
This package contains the speaker binary."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "metallb-speaker-0.9.5-1.14.aarch64.rpm"
RPM_HASH = "25574833967e447e2f144eff989521d0888ef287ecd53aa23e8f9b3f65d6bca7cd550589da2452db7c8b3c1d0f6944a3a0673dedb412a152e787d6cd3300ffcd"

RPROVIDES:${PN} += "metallb-speaker"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
