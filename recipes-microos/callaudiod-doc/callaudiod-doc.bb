SUMMARY = "API documentation for callaudiod"
DESCRIPTION = "A daemon for audio calls. \
This package contains API documentation for callaudiod."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.4"

RPM_NAME = "callaudiod-doc-0.1.4-1.3.noarch.rpm"
RPM_HASH = "ec53ec08633883a6cf0da53d13b91be4220843c77448ad036db9c95895fe93468d8d123fcc59b37d2c0dbd92646fb49e75f211045b46c08d592f3a64b5b07bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "callaudiod-doc"
RDEPENDS:${PN} += ""

inherit rpm
