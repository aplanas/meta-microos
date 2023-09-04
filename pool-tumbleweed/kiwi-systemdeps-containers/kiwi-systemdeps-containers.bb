SUMMARY = "KIWI - host requirements for OCI container images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build OCI container images"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "kiwi-systemdeps-containers-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "48cb0e85a382a7d507ae65462f4931aa92b0a9a17fd69ac26ddd343c9c75581c292cf04070588199692f919daa534ead2eeaa924b69c0fc37a5a1884954a67db"

RPROVIDES:${PN} += "kiwi-image-docker \
kiwi-image-docker-requires \
kiwi-systemdeps-containers"

RDEPENDS:${PN} += "skopeo \
umoci"

inherit rpm
