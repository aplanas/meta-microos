SUMMARY = "Documentation for texlive-mkpattern"
DESCRIPTION = "This package includes the documentation for texlive-mkpattern"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-mkpattern-doc-2023.209.1.2svn15878-55.1.noarch.rpm"
RPM_HASH = "49158ede3581db37376ccafc0c22b49defe15fb46e81147e5c3a367bf9ab7be983bc1ff76588a7eca5700d0c3850fe5379dee88269372b330090cf0bbc227728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkpattern-doc"

RDEPENDS:${PN} += ""

inherit rpm
