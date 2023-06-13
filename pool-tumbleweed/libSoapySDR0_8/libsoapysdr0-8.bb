SUMMARY = "Vendor and platform neutral SDR support library"
DESCRIPTION = "A vendor neutral and platform independent SDR support library."
LICENSE = "BSL-1.0"

PV = "0.8.1"

RPM_NAME = "libSoapySDR0_8-0.8.1-1.11.aarch64.rpm"
RPM_HASH = "9ea77e7d8122d931286a7a34992bf99c540ee9bc3652dd23e0f5302f31f30fb70f3aff709f6cbd06b6e591540a1f20f3c7206d6f0d74cbc7bf4162215920ca18"

RPROVIDES:${PN} += "libSoapySDR.so.0.8()(64bit) \
libSoapySDR0_8 \
libSoapySDR0_8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
