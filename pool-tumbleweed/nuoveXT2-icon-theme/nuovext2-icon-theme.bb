SUMMARY = "This package provides the default LXDE icon theme"
DESCRIPTION = "This package provides the default LXDE icon theme. \
nuoveXT2-icon-theme is no more maintained from his author so \
LXDE project decided to maintain it and keep working on it"
LICENSE = "GPL-3.0"

PV = "0.5.1"

RPM_NAME = "nuoveXT2-icon-theme-0.5.1-1.17.noarch.rpm"
RPM_HASH = "aa951acc7d5a0494415f8d2ba85bdc034bc4930dbf8f71ebf7bcd572ac8c6872f7a0c9f24b40c69eed0353550e90df3390b481c36e424e3a546c249bacfaa191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nuoveXT2-icon-theme"
RDEPENDS:${PN} += ""

inherit rpm
