SUMMARY = "Documentation for texlive-jmlr"
DESCRIPTION = "This package includes the documentation for texlive-jmlr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.30svn61957"

RPM_NAME = "texlive-jmlr-doc-2023.201.1.30svn61957-55.1.noarch.rpm"
RPM_HASH = "9e4eb9d91c28c8041819c7c567ca9b36149d5ec8dcabf675a912ed5c7d4536dac9a811d69aab8241b179b70c790b36b2c926f656922ebfec769725272adb5e6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jmlr-doc"

RDEPENDS:${PN} += ""

inherit rpm
