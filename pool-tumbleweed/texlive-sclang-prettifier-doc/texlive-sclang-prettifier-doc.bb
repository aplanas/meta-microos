SUMMARY = "Documentation for texlive-sclang-prettifier"
DESCRIPTION = "This package includes the documentation for texlive-sclang-prettifier"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn35087"

RPM_NAME = "texlive-sclang-prettifier-doc-2023.209.0.0.1svn35087-54.1.noarch.rpm"
RPM_HASH = "cd3b3c2c29b3830ea50527143e9d3d0ed95ef19f781a7d9d81d56df2a13678d24ce8f89ab1142b4aed0b973b130fef3e9a651fbca6140a8a387c8b6195aee11b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sclang-prettifier-doc"

RDEPENDS:${PN} += ""

inherit rpm
