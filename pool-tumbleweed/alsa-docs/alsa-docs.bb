SUMMARY = "Additional Package Documentation for ALSA"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.10"

RPM_NAME = "alsa-docs-1.2.10-1.1.noarch.rpm"
RPM_HASH = "687459f3188615900d8a72d51e57a206b4db1c9ffebfe50f0c4bb71b7ec6efe308124dd1c8d47dd9a394c3e9e00794e7355763d5a81734e8e367f7b89ef77c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alsa-docs"

RDEPENDS:${PN} += ""

inherit rpm
