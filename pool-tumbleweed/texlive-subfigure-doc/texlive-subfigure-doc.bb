SUMMARY = "Documentation for texlive-subfigure"
DESCRIPTION = "This package includes the documentation for texlive-subfigure"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.5svn15878"

RPM_NAME = "texlive-subfigure-doc-2023.209.2.1.5svn15878-58.1.noarch.rpm"
RPM_HASH = "44b617e1193b64c816d4db99b3459cd04a37e7cba917eb563b82434a674993505afe165ba19533b4d00aa01d361e9f46f2697405c1bd8eaebb6a02cebb7f25dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfigure-doc"

RDEPENDS:${PN} += ""

inherit rpm
