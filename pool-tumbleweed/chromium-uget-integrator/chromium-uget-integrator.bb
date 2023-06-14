SUMMARY = "Integration of uGet with Chromium"
DESCRIPTION = "Integration of the uGet Download Manager with Chromium."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "chromium-uget-integrator-1.0.0-2.10.aarch64.rpm"
RPM_HASH = "c89c68ad37aabd1179ba76b37b921b834fedfe42507cc0c3860439d7f1e77ea16b5578b3c72188ce91fe036e736fb0f3caf0b1b8e43fbd18790d9b97e8f5227f"

RPROVIDES:${PN} += "chromium-uget-integrator \
config-chromium-uget-integrator"

RDEPENDS:${PN} += "uget-integrator"

inherit rpm
