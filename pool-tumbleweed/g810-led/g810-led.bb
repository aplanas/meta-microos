SUMMARY = "Controller for Logitech LED keyboards"
DESCRIPTION = "Linux controller for Logitech Led Keyboards. \
Compatible keyboards: \
  G213 Prodigy \
  G410 Atlas Spectrum \
  G413 Carbon \
  G512 Carbon \
  G513 Carbon \
  G610 Orion (Brown and Red) \
  G810 Orion Spectrum \
  G910 Orion (Spark and Spectrum) \
  GPRO"
LICENSE = "GPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "g810-led-0.4.3-2.1.aarch64.rpm"
RPM_HASH = "9bc39cade403eaf33a8cfe04cb972fb1f7bb6450eb86c13868351b601de7f8110c3502f750851d8acbe69c04693e5a37c52d52da80760d1651fede1d94fe32ff"

RPROVIDES:${PN} += "config-g810-led \
g810-led"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libhidapi-hidraw.so.0 \
libstdc++.so.6 \
systemd"

inherit rpm
