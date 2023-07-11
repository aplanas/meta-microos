SUMMARY = "KIWI - host requirements for OCI container images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build OCI container images"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-containers-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "1016c115aa05b6c7b8d8b9fcb60047345539775792d7d4ed0e14f873757f7362dde88dc8d743d8a0d841fdba7ca8041f31a36fbbe234fdb02c87477510087a65"

RPROVIDES:${PN} += "kiwi-image-docker \
kiwi-image-docker-requires \
kiwi-systemdeps-containers"

RDEPENDS:${PN} += "skopeo \
umoci"

inherit rpm
