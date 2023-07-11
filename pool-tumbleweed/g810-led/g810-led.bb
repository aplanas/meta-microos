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

RPM_NAME = "g810-led-0.4.3-2.2.aarch64.rpm"
RPM_HASH = "6e04ea6212d505be3d0eb8ae7068a5e0bef1d67e131cf5dc3cc77159ce336a4e2e66ccea92b40d009b71c1d0949dbafff0ab62bd09d19ca1f491b046ad826673"

RPROVIDES:${PN} += "config-g810-led \
g810-led"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libhidapi-hidraw.so.0 \
libstdc++.so.6 \
systemd"

inherit rpm
