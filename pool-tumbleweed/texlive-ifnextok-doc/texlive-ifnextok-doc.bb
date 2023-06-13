SUMMARY = "Documentation for texlive-ifnextok"
DESCRIPTION = "This package includes the documentation for texlive-ifnextok"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn23379"

RPM_NAME = "texlive-ifnextok-doc-2023.201.0.0.3svn23379-52.1.noarch.rpm"
RPM_HASH = "b4f076b386b599d1b2c00ebe93272bb86cb545beac8229ee7c8b178c87c0cd0cecaf1f8221e24848211e77264176e0ce8b06c6c08ad01608331189bfc091b46f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifnextok-doc"

RDEPENDS:${PN} += ""

inherit rpm
