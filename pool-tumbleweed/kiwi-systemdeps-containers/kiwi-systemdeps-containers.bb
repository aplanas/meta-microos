SUMMARY = "KIWI - host requirements for OCI container images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build OCI container images"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-containers-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "6118e12934f9e7d16d0e1fe95b09664101b44372a38709ddc596b992bcea8bb5a172fffe49a1d89e4308a0fda4a9d4cb59b574542d8f3787d557aa1d919cc7a7"

RPROVIDES:${PN} += "kiwi-image-docker \
kiwi-image-docker-requires \
kiwi-systemdeps-containers"

RDEPENDS:${PN} += "skopeo \
umoci"

inherit rpm
