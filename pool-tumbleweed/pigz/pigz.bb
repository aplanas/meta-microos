SUMMARY = "Multi-core gzip version"
DESCRIPTION = "A parallel implementation of gzip for modern multi-processor, multi-core machines"
LICENSE = "Zlib"

PV = "2.7"

RPM_NAME = "pigz-2.7-1.7.aarch64.rpm"
RPM_HASH = "a81dbaaf45ec4f08986698890a4c80a7871146897df7aa165a01aaab2523b30b79f353a11a5b673a4e88561cb25002941361d22091165a07bd1e69b79d468c1d"

RPROVIDES:${PN} += "pigz"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
