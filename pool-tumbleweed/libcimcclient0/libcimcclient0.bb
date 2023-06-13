SUMMARY = "CIM C Client Loader Implementation"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Runtime Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.8"

RPM_NAME = "libcimcclient0-2.2.8-1.23.aarch64.rpm"
RPM_HASH = "952c60cf2b8498caab6114fe2874995ee851022fdd859e746246aed0eae72c6c3462fc514080761c2ed9fcff694a4d96af6befcacefcc17ad1ebdfa4b3aba919"

RPROVIDES:${PN} += "libcimcclient.so.0()(64bit) \
libcimcclient0 \
libcimcclient0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
