SUMMARY = "Documentation for texlive-aurl"
DESCRIPTION = "This package includes the documentation for texlive-aurl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn41853"

RPM_NAME = "texlive-aurl-doc-2023.201.svn41853-53.1.noarch.rpm"
RPM_HASH = "bf0a021a36f23f22845447afe4be999bef36fcd3352630beb034a05f14bc1f6612eef77e16bdf92462a607de91fdf2efbdb575842ad76ede791b8b9812e927bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aurl-doc"
RDEPENDS:${PN} += ""

inherit rpm
