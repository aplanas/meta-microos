SUMMARY = "Documentation for texlive-dice"
DESCRIPTION = "This package includes the documentation for texlive-dice"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28501"

RPM_NAME = "texlive-dice-doc-2023.201.svn28501-52.1.noarch.rpm"
RPM_HASH = "05d39b96e2af05a6533b914f76d3fd4309ad559e2c9d5f83adb5820e996374ee23bb7e9c29d6dea4cd36921dadf6ff3389561fb1c11bf1c0dac4dd88851da5cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dice-doc"
RDEPENDS:${PN} += ""

inherit rpm
