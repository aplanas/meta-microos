SUMMARY = "Health-checker plugins for openSUSE Kubic"
DESCRIPTION = "This package contains health-checker plugins for testing that \
the openSUSE Kubic did boot correctly."
LICENSE = "GPL-2.0-only"

PV = "1.8"

RPM_NAME = "health-checker-plugins-kubic-1.8-1.1.noarch.rpm"
RPM_HASH = "cc52bb2a023110dd07ee399c7b35a5134ddc4096f64161b4e92fccb4d0984d3a164bcb53bf0f69167d8ffcbc682db1b40a70ca6b0d05e4d485850df944097145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins \
health-checker-plugins-kubic"

RDEPENDS:${PN} += "/bin/bash \
health-checker"

inherit rpm
