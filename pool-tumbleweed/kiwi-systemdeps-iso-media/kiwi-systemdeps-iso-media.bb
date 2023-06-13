SUMMARY = "KIWI - host requirements for live and install iso images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build live and install iso images."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-iso-media-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "b873b3ae4575ddacab7ae975dde3931e93c06d2432044cb11f58baeb0b92223711225231d8fc95142be30f9d98dda6fc3865228bd82ac04f407edb94b2477804"

RPROVIDES:${PN} += "kiwi-image-iso-requires \
kiwi-image:iso \
kiwi-systemdeps-iso-media \
kiwi-systemdeps-iso-media(aarch-64)"

RDEPENDS:${PN} += "checkmedia \
kiwi-systemdeps-bootloaders \
kiwi-systemdeps-core \
kiwi-systemdeps-filesystems \
xorriso"

inherit rpm
