SUMMARY = "IEEE 802.11 wireless LAN analyzer"
DESCRIPTION = "horst is an IEEE 802.11 WLAN analyzer with a text interface. Its \
basic function is similar to tcpdump, Wireshark or Kismet, but it \
shows different, aggregated information. It is made for debugging \
wireless LANs with a focus on getting a quick overview instead of \
deep packet inspection and has features for ad-hoc (IBSS) mode and \
mesh networks."
LICENSE = "GPL-2.0-only"

PV = "5.1"

RPM_NAME = "horst-5.1-4.7.aarch64.rpm"
RPM_HASH = "bb9e0e3ed536a867e19e28c46e616df40e38a95e169db73292ec8b34c9fe0d0cee575ff9351150f0edd487656df276dde9b4ef8f4d204b19f257371aac62cb7a"

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
