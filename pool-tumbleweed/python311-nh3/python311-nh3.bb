SUMMARY = "Ammonia HTML sanitizer Python binding"
DESCRIPTION = "Ammonia HTML sanitizer Python binding"
LICENSE = "MIT"

PV = "0.2.13"

RPM_NAME = "python311-nh3-0.2.13-1.1.aarch64.rpm"
RPM_HASH = "6ba8324a6966bd7b0d14349a157629fbbeb55622cf24068d59addf0afe6588b904a3e563b9d2c2d80539542e549ff956e656846e3c42610c9bfdde5ad8fbf308"

RPROVIDES:${PN} += "python3-nh3 \
python3.11dist-nh3 \
python311-nh3 \
python3dist-nh3"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
