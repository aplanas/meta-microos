SUMMARY = "Documentation for texlive-cals"
DESCRIPTION = "This package includes the documentation for texlive-cals"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4.2svn43003"

RPM_NAME = "texlive-cals-doc-2023.201.2.4.2svn43003-52.1.noarch.rpm"
RPM_HASH = "2b414e626736fd47b653717bc381a5fe717b9a3ef7c4bd5e5cadbeaf5be2ef197aaeb621d9edfa4371057728372b0b48e868dd656bd9f856fe8659df178bc161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cals-doc"

RDEPENDS:${PN} += ""

inherit rpm
