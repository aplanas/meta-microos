SUMMARY = "Support for Cloud"
DESCRIPTION = "Packages required to enable openSUSE MicroOS in the Cloud."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-cloud-5.0-73.1.aarch64.rpm"
RPM_HASH = "6e2a09352ae4341a039f977a4b6a25d101c44b5f192793417a4b00274ecefa0497d5c996b0b37a6bb22bed4bda47cf0bf88e3147f928dbf0a12fc60221294e98"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-cloud"

RDEPENDS:${PN} += "cloud-init \
cloud-init-config-MicroOS"

inherit rpm
