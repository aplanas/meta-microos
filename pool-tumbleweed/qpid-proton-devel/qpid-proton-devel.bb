SUMMARY = "Development libraries for writing messaging apps with Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "qpid-proton-devel-0.38.0-1.6.aarch64.rpm"
RPM_HASH = "418ffac4eaa810a48800c978312bcec60b04e0e21001372db7dfbb00922a29c82729ff9554215eb7a92fef53552dec78b48a3ce01b738fb4b4d1b1a5d8c810e2"

RPROVIDES:${PN} += "cmake-Proton \
cmake-ProtonCpp \
pkgconfig-libqpid-proton \
pkgconfig-libqpid-proton-core \
pkgconfig-libqpid-proton-cpp \
pkgconfig-libqpid-proton-proactor \
qpid-proton-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqpid-proton-core10 \
libqpid-proton-cpp12 \
libqpid-proton11 \
pkgconfig-libqpid-proton-core \
pkgconfig-libqpid-proton-proactor"

inherit rpm
