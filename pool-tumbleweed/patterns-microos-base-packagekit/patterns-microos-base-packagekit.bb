SUMMARY = "openSUSE MicroOS using PackageKit"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the PackageKit service. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-packagekit-5.0-70.1.aarch64.rpm"
RPM_HASH = "f7b1042a6f3ac384a19069f5db9612d44987f2e04b996958e98fb1891668c5644ca16e1c71a5142b7b36b4e8ee1b33d2c971affb5d808a6a8ba7ca70530338cc"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-base-packagekit"

RDEPENDS:${PN} += "-libdnf-repo-config-zypp or rpm-repos-openSUSE \
PackageKit \
PackageKit-branding-openSUSE \
libdnf-plugin-txnupd \
pattern-"

inherit rpm
