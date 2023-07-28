SUMMARY = "Ammonia HTML sanitizer Python binding"
DESCRIPTION = "Ammonia HTML sanitizer Python binding"
LICENSE = "MIT"

PV = "0.2.13"

RPM_NAME = "python39-nh3-0.2.13-1.1.aarch64.rpm"
RPM_HASH = "78a7d431bd64e6f8a39ca13493be051629b5df48be2890188dd054dffc590b83bed7e0e27db961f71d85f671bb1feab796413e845c0aff21110849401c714520"

RPROVIDES:${PN} += "python3.9dist-nh3 \
python39-nh3 \
python3dist-nh3"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
