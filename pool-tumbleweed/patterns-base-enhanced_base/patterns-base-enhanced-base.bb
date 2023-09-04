SUMMARY = "Enhanced Base System"
DESCRIPTION = "This is the enhanced base runtime system with lots of convenience packages."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-enhanced_base-20200505-42.1.aarch64.rpm"
RPM_HASH = "e3e28ae00df63402edb5c74f32c412d3f25e6d2c6bdb922be6e0b7d2b5c6797c76beec528236ceb7ba3cadfb5d84ba7b192836a2c3db3a5976394183619596d6"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-enhanced-base \
patterns-openSUSE-enhanced-base"

RDEPENDS:${PN} += "openssh \
pattern-"

inherit rpm
