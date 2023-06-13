SUMMARY = "Vendor and platform neutral SDR support library"
DESCRIPTION = "A vendor neutral and platform independent SDR support library."
LICENSE = "BSL-1.0"

PV = "0.8.1"

RPM_NAME = "soapy-sdr-0.8.1-1.11.aarch64.rpm"
RPM_HASH = "3938242e3b41bdecdc45399fc9bf2e2c70e06ecce14054820bdee4e9cd83f8804b5a072f8f0cd9117b8b60a74ddb3f7b8a900809f7bdd6b828a5b77a3afc6e3d"

RPROVIDES:${PN} += "soapy-sdr \
soapy-sdr(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSoapySDR.so.0.8()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
