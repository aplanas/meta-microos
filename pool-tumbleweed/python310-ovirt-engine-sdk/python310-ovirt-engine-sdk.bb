SUMMARY = "Python SDK for oVirt Engine API"
DESCRIPTION = "Python SDK for oVirt Engine API"
LICENSE = "Apache-2.0"

PV = "4.4.9"

RPM_NAME = "python310-ovirt-engine-sdk-4.4.9-1.13.aarch64.rpm"
RPM_HASH = "4c48d3045acf886416a9eacd8935b8b5f19e765e77450c9fd602f256ec492183c9f501f38f452c0d47c7dfe12c982c6f8b370c2eec4cf6bfcbd1595cb1f9e0fb"

RPROVIDES:${PN} += "python3-ovirt-engine-sdk \
python3.10dist(ovirt-engine-sdk-python) \
python310-ovirt-engine-sdk \
python310-ovirt-engine-sdk(aarch-64) \
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
python310-pycurl \
python310-six"

inherit rpm
