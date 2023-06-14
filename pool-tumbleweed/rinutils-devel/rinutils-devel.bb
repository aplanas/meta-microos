SUMMARY = "Shlomi Fish's gnu11 C Library of Random headers"
DESCRIPTION = "Shlomi Fish's gnu11 C Library of Random headers."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "rinutils-devel-0.10.1-1.3.noarch.rpm"
RPM_HASH = "695f30b95a2cc7045199101a5d8ba248a25c4f844af2167a9e620f89d3ec9a4e021153d7d9a23f6a6f4f4e9cb5f27177628e1d6d55cb8e18b558ad2d18291480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-Rinutils \
pkgconfig-librinutils \
rinutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
