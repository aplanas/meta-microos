SUMMARY = "Support for Cloud"
DESCRIPTION = "Packages required to enable openSUSE MicroOS in the Cloud."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-cloud-5.0-72.1.aarch64.rpm"
RPM_HASH = "653c19ecc0a6991a867bf0b89750fdbdae47048c2ea78f8aae2e57a514b3d4c14133cc26d0eeb873cccd7753f909e43a24178cb9dfe5fc8ff9a2437993bda97f"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-cloud"

RDEPENDS:${PN} += "cloud-init \
cloud-init-config-MicroOS"

inherit rpm
