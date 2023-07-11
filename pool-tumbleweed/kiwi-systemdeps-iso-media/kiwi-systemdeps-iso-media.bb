SUMMARY = "KIWI - host requirements for live and install iso images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build live and install iso images."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-iso-media-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "b4502862681a3b021d1aee481423ade5fcdf5fdfa4edc40f766f25f6a08272c54615516518cafb7921b2ddf0e20b0890ed5f723e45464ccae2339166d07a9ff5"

RPROVIDES:${PN} += "kiwi-image-iso \
kiwi-image-iso-requires \
kiwi-systemdeps-iso-media"

RDEPENDS:${PN} += "checkmedia \
kiwi-systemdeps-bootloaders \
kiwi-systemdeps-core \
kiwi-systemdeps-filesystems \
xorriso"

inherit rpm
