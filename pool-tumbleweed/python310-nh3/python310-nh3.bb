SUMMARY = "Ammonia HTML sanitizer Python binding"
DESCRIPTION = "Ammonia HTML sanitizer Python binding"
LICENSE = "MIT"

PV = "0.2.13"

RPM_NAME = "python310-nh3-0.2.13-1.1.aarch64.rpm"
RPM_HASH = "8d943d6037936e6965c38555f342e878069fcbe583a88c248f7d3cec025e2b23d50f733657937c0d3f3a0b7f574bf83b71ab2988836f2071fcc3244b87ee5523"

RPROVIDES:${PN} += "python3.10dist-nh3 \
python310-nh3 \
python3dist-nh3"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
