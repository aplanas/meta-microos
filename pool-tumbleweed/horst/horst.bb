SUMMARY = "IEEE 802.11 wireless LAN analyzer"
DESCRIPTION = "horst is an IEEE 802.11 WLAN analyzer with a text interface. Its \
basic function is similar to tcpdump, Wireshark or Kismet, but it \
shows different, aggregated information. It is made for debugging \
wireless LANs with a focus on getting a quick overview instead of \
deep packet inspection and has features for ad-hoc (IBSS) mode and \
mesh networks."
LICENSE = "GPL-2.0-only"

PV = "5.1"

RPM_NAME = "horst-5.1-4.8.aarch64.rpm"
RPM_HASH = "479c432ecb44488f85cb7924a3b0dc59b15a6165ac8a10a891fac14c905c642e6aabd8b464509fa4eb0fef0ecf6fb153e4ecfed58dc58c5392602f9388773bb2"

RPROVIDES:${PN} += "config-horst \
horst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libtinfo.so.6"

inherit rpm
