SUMMARY = "openSUSE MicroOS using PackageKit"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the PackageKit service. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-packagekit-5.0-73.1.aarch64.rpm"
RPM_HASH = "332ce9a22e55d1559894e443743660442bd5c0b1162582cc37b747107257ef9dad596a36bfda015eccd26fcacb7c65fae19a131cbd8a29f9655cd2fbf692a791"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-base-packagekit"

RDEPENDS:${PN} += "PackageKit \
PackageKit-branding-openSUSE \
libdnf-plugin-txnupd \
pattern-"

inherit rpm
