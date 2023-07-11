SUMMARY = "Binary files of ltxfileinfo"
DESCRIPTION = "Binary files of ltxfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29005"

RPM_NAME = "texlive-ltxfileinfo-bin-2023.20230311.svn29005-92.1.aarch64.rpm"
RPM_HASH = "854e389737e4349e2a14280631d1b381cf52c1a80f8dea5a2286f010315bce18a97d6154fd5ad792e8b77a36c3d557eb8f81b87428cedbb1bec4c3b51b108660"

RPROVIDES:${PN} += "texlive-ltxfileinfo-bin"

RDEPENDS:${PN} += "texlive-ltxfileinfo"

inherit rpm
