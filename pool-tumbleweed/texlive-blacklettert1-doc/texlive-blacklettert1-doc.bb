SUMMARY = "Documentation for texlive-blacklettert1"
DESCRIPTION = "This package includes the documentation for texlive-blacklettert1"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-blacklettert1-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "795d87dd76e1748e407aade8ef0037db315acfc583ec530981f171ba7e12b16a26381524512f8d8e3a03693ebd7b77a4f68fa14eea441acac39a6723f838de31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blacklettert1-doc"

RDEPENDS:${PN} += ""

inherit rpm
