SUMMARY = "Documentation for texlive-ifnextok"
DESCRIPTION = "This package includes the documentation for texlive-ifnextok"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn23379"

RPM_NAME = "texlive-ifnextok-doc-2023.209.0.0.3svn23379-54.1.noarch.rpm"
RPM_HASH = "9f6bcb1152d92acf9196f5d1553aaa9e56488841709851a5f443bd98a2a5df5fe29b2c56a5c5837d803bef34ebc59d370e81ae332835637cb4155028ead5da94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifnextok-doc"

RDEPENDS:${PN} += ""

inherit rpm
