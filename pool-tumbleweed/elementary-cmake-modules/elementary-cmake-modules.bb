SUMMARY = "Elementary CMake modules"
DESCRIPTION = "CMake modules shared in Elementary projects."
LICENSE = "GPL-3.0"

PV = "0.1.0.bzr.25"

RPM_NAME = "elementary-cmake-modules-0.1.0.bzr.25-1.15.noarch.rpm"
RPM_HASH = "11b6829e9f781fee22177dd10ce018533f3c034af76afe8b67b51378828b10903d93a35ddd9986e183a6408081e5df8fcf1a3cff74d82582ee00abcc2f9a903a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-cmake-modules"
RDEPENDS:${PN} += ""

inherit rpm
