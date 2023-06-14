SUMMARY = "KIWI - Host system dependencies"
DESCRIPTION = "Host setup helper to pull in all packages required/useful to \
leverage all functionality in KIWI."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "beb93ec3c3857f21d866fd0ff6cd79ed2bf1ef5b3c0457d3f78a8d8a8d6feb92fa261fe759742ff20d2f45e568e05b6712d68a5224697e3419c751cc0e603d46"

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
