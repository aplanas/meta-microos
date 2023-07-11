SUMMARY = "KIWI - Host system dependencies"
DESCRIPTION = "Host setup helper to pull in all packages required/useful to \
leverage all functionality in KIWI."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "140f894ce03fb8660a095e5f4bb837bb914f353bedd167e0874779e6a2039c3f01f43271b5cb5b4365e7793b17f42267fd1f4ee3e615168cdc59ea4ba9d174a4"

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
