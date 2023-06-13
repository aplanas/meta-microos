SUMMARY = "Virtual Machine Monitor for creating microVMs"
DESCRIPTION = "Firecracker is a virtualization technology for creating and managing \
multi-tenant container and function-based services."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "firecracker-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "d8fe6736c58e767399dfedb06f2a7a26c4ae8e0c61097649c366b0824feb196c6dbf02b8b9285d81822404159925df338b82b7ada2801efa06e812c9b2cbdca2"

RPROVIDES:${PN} += "firecracker \
firecracker(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
