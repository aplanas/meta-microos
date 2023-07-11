SUMMARY = "openSUSE MicroOS using PackageKit"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the PackageKit service. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-packagekit-5.0-72.1.aarch64.rpm"
RPM_HASH = "f1bb56612bc946dfdac212f85a1cf78020abbc5ba82635fc44d7c3bddb3eea31ab5953a811000558b8e26a48bf98b1c42870fc4d133361183c923224866925bf"

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
