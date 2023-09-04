SUMMARY = "KIWI - host requirements for live and install iso images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build live and install iso images."
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "kiwi-systemdeps-iso-media-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "9f90937d2de6b573eb80301f266db3da425126c7160d684820d8bbdc1b2b544cf691c7780ff925985c2b7e7922c293d999086dff32ec03c3dfb9c18e1d91b89f"

RPROVIDES:${PN} += "kiwi-image-iso \
kiwi-image-iso-requires \
kiwi-systemdeps-iso-media"

RDEPENDS:${PN} += "checkmedia \
kiwi-systemdeps-bootloaders \
kiwi-systemdeps-core \
kiwi-systemdeps-filesystems \
xorriso"

inherit rpm
