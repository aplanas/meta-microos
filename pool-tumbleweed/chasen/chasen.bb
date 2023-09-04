SUMMARY = "Japanese Morphological Analysis System"
DESCRIPTION = "ChaSen is a Japanese morphological analysis system."
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "chasen-2.4.5-2.13.aarch64.rpm"
RPM_HASH = "441d92eff40ecfa79f56a3941387a2fdad59e5046379fa6881b0398c8972231f47869b94395c18c9159d1493d949ae33c5a233e8d0854fc2c663b64d7adc9057"

RPROVIDES:${PN} += "chasen \
libchasen.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ipadic \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
