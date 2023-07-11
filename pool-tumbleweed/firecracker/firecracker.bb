SUMMARY = "Virtual Machine Monitor for creating microVMs"
DESCRIPTION = "Firecracker is a virtualization technology for creating and managing \
multi-tenant container and function-based services."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "firecracker-1.3.2-1.2.aarch64.rpm"
RPM_HASH = "25f3ba18041b3c54333e5d65c2c94314dca31c4a6ba673eb9cfd8c685ffa64515fcac2f3b853b6dd9adc2f3108e3fe0b1d5a9b8170fc8342cbefc52369f0719b"

RPROVIDES:${PN} += "firecracker"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
