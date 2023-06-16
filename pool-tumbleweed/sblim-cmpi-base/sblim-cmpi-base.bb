SUMMARY = "SBLIM Base Instrumentation"
DESCRIPTION = "Standards Based Linux Instrumentation Base Providers"
LICENSE = "EPL-1.0"

PV = "1.6.4"

RPM_NAME = "sblim-cmpi-base-1.6.4-7.15.aarch64.rpm"
RPM_HASH = "e44b734735156db477fb46b3571ba581c1ff6ddf272a059bd15ee07fc1d63fa2de17b1a92fa25a1c75bfcdcbaf7369d332dc0395e2bc548b9473b2eafd2f6c03"

RPROVIDES:${PN} += "libcmpiOSBase-BaseBoardProvider.so \
libcmpiOSBase-CSBaseBoardProvider.so \
libcmpiOSBase-CSProcessorProvider.so \
libcmpiOSBase-Common.so.0 \
libcmpiOSBase-ComputerSystemProvider.so \
libcmpiOSBase-OSProcessProvider.so \
libcmpiOSBase-OperatingSystemProvider.so \
libcmpiOSBase-OperatingSystemStatisticalDataProvider.so \
libcmpiOSBase-OperatingSystemStatisticsProvider.so \
libcmpiOSBase-ProcessorProvider.so \
libcmpiOSBase-RunningOSProvider.so \
libcmpiOSBase-UnixProcessProvider.so \
libdmiinfo.so.0 \
sblim-cmpi-base"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
cim-schema \
cim-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libind-helper.so.0"

inherit rpm
