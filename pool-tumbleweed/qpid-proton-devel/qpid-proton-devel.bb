SUMMARY = "Development libraries for writing messaging apps with Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "qpid-proton-devel-0.38.0-1.4.aarch64.rpm"
RPM_HASH = "42bb1e63ad1be4e6382ef4a3fe5785f46fda6cbd22c647567ceecf4ac227ab13ea1231e577a4b457803d0ac05b1c0745645c5ba8327b64855b055a02d358cfd4"

RPROVIDES:${PN} += "cmake(Proton) \
cmake(ProtonCpp) \
pkgconfig(libqpid-proton) \
pkgconfig(libqpid-proton-core) \
pkgconfig(libqpid-proton-cpp) \
pkgconfig(libqpid-proton-proactor) \
qpid-proton-devel \
qpid-proton-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqpid-proton-core10 \
libqpid-proton-cpp12 \
libqpid-proton11 \
pkgconfig(libqpid-proton-core) \
pkgconfig(libqpid-proton-proactor)"

inherit rpm
