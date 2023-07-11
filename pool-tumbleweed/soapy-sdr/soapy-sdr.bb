SUMMARY = "Vendor and platform neutral SDR support library"
DESCRIPTION = "A vendor neutral and platform independent SDR support library."
LICENSE = "BSL-1.0"

PV = "0.8.1"

RPM_NAME = "soapy-sdr-0.8.1-1.12.aarch64.rpm"
RPM_HASH = "62843838579846abb0e8d9e4a6f5d048fd4d6895eb74f9cf3d6d0a831f6585988cdb395959c17e674d5fec87d7553288a4acf3aabbe736b39756ff0d4c79dbb3"

RPROVIDES:${PN} += "soapy-sdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
