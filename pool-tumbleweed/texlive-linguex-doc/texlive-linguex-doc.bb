SUMMARY = "Documentation for texlive-linguex"
DESCRIPTION = "This package includes the documentation for texlive-linguex"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.3svn30815"

RPM_NAME = "texlive-linguex-doc-2023.209.4.3svn30815-55.1.noarch.rpm"
RPM_HASH = "a9a78d02384f06d40ef3171f78e36d1178bc4be5551f073b745cc53adadef762283eff907eed671a2431757732f9b88037761a95b5a3400cd80b1cbbe7af0dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linguex-doc"

RDEPENDS:${PN} += ""

inherit rpm
