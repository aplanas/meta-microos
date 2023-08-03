SUMMARY = "Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the core runtime library."
LICENSE = "MIT"

PV = "2.19.0"

RPM_NAME = "libva2-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "d313f8c3e00e64e7d2de2735a6461f0a0159925ab8062397955d6ab3e94174f4450ea1850837674546cae75bb88c271bda19968c69a85e88929f2f7d28ce6aec"

RPROVIDES:${PN} += "libva.so.2 \
libva2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
