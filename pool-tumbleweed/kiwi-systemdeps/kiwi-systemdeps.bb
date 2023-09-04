SUMMARY = "KIWI - Host system dependencies"
DESCRIPTION = "Host setup helper to pull in all packages required/useful to \
leverage all functionality in KIWI."
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "kiwi-systemdeps-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "0a5aec4d28cf0ef11f823c90099c4cc1b0fbb03bd2b8c5c8ebe394201f4e4326a80d4363c08cddde1a5787ac189fe3d3e3f3cc1fdd63e07744e1050055b91ef5"

RPROVIDES:${PN} += "kiwi-systemdeps"

RDEPENDS:${PN} += "kiwi-systemdeps-bootloaders \
kiwi-systemdeps-containers \
kiwi-systemdeps-containers-wsl \
kiwi-systemdeps-core \
kiwi-systemdeps-disk-images \
kiwi-systemdeps-filesystems \
kiwi-systemdeps-image-validation \
kiwi-systemdeps-iso-media"

inherit rpm
