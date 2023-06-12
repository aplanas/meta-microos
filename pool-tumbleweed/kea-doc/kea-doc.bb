SUMMARY = "Documentation for Kea"
DESCRIPTION = "This package contains the documentation for Kea."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "kea-doc-2.2.0-2.4.noarch.rpm"
RPM_HASH = "7f7b563f76f24a5e07d6a1ec51c691a0fe989ee8f57bc913619ef819fe7c091358263bd1e0bedcd43c8b338924eeecaa6b70bb4353d702444eec3fe0e39a1f0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kea-doc"
RDEPENDS:${PN} += ""

inherit rpm
