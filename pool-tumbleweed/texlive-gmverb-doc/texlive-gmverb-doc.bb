SUMMARY = "Documentation for texlive-gmverb"
DESCRIPTION = "This package includes the documentation for texlive-gmverb"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.98svn24288"

RPM_NAME = "texlive-gmverb-doc-2023.201.0.0.98svn24288-53.1.noarch.rpm"
RPM_HASH = "55ce73e6ca36f2c2c15fee4676a6714ba16e3de2c1145189b38868a9e1adb4419663b818c31947ae6a110c4222161e26c76ae3f3a465595642f4f95a492c1d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmverb-doc"

RDEPENDS:${PN} += ""

inherit rpm
