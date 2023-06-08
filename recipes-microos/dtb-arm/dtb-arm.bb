SUMMARY = "ARM Ltd. based arm64 systems"
DESCRIPTION = "Device Tree files for ARM Ltd. based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-arm-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "22ce6ea7e2233f0fdffde0b62a50ff3c29fa328c9c2271e69275844c2f8e165ab724826fdfa3b9d67e0dd18a07662a6553fe7aa6d6ede2ab91c299436ff0f7db"

RPROVIDES:${PN} += "dtb-arm dtb-arm(aarch-64) dtb-foundation-v8 dtb-rtsm_ve-aemv8a multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
