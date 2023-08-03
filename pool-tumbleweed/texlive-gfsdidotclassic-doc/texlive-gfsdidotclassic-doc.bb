SUMMARY = "Documentation for texlive-gfsdidotclassic"
DESCRIPTION = "This package includes the documentation for texlive-gfsdidotclassic"
LICENSE = "OFL-1.1"

PV = "2023.209.001.001svn52778"

RPM_NAME = "texlive-gfsdidotclassic-doc-2023.209.001.001svn52778-53.1.noarch.rpm"
RPM_HASH = "914ccbcdcc6803b2596c2222fe4197c88195ec343cf57b704e82c6f343d214a6fdb2fd326951b03971743159aef4f777a0a8faa52babc3eef5e884390c8d5a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsdidotclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
