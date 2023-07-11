SUMMARY = "SBLIM Base Instrumentation"
DESCRIPTION = "Standards Based Linux Instrumentation Base Providers"
LICENSE = "EPL-1.0"

PV = "1.6.4"

RPM_NAME = "sblim-cmpi-base-1.6.4-7.16.aarch64.rpm"
RPM_HASH = "d991297c12a4d4c21dbc70af633267da46c4356fbac8b861d6f5a058613140d6e7c3dff6a060597f918fbb6fa503cbf317555baefd501bff58dc43110a398894"

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
