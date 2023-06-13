SUMMARY = "Small Footprint CIM Client Library"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Runtime Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.8"

RPM_NAME = "libcimcClientXML0-2.2.8-1.23.aarch64.rpm"
RPM_HASH = "4108e33a567bb928145b3310adef297e325bb4b9f8df266f886286bd657def2304bcad10cc7f6915b7bbeea8d66807cfedaf4cebf191b544ca412c3e553e2c1e"

RPROVIDES:${PN} += "libcimcClientXML.so.0()(64bit) \
libcimcClientXML0 \
libcimcClientXML0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit)"

inherit rpm
