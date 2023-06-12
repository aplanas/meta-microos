SUMMARY = "Python SDK for oVirt Engine API"
DESCRIPTION = "Python SDK for oVirt Engine API"
LICENSE = "Apache-2.0"

PV = "4.4.9"

RPM_NAME = "python311-ovirt-engine-sdk-4.4.9-1.13.aarch64.rpm"
RPM_HASH = "2a9b70b87f895e47434731ef78f473aeeb29eb10db3081c3c63e5e12878c65458c7b5a24f434a78f17fa66f21fd9ae43bd7ffb12e0b0ea1f1f10e2b690c65eed"

RPROVIDES:${PN} += "python3.11dist(ovirt-engine-sdk-python) \
python311-ovirt-engine-sdk \
python311-ovirt-engine-sdk(aarch-64) \
python3dist(ovirt-engine-sdk-python)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit) \
python(abi) \
python311-pycurl \
python311-six"

inherit rpm