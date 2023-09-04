SUMMARY = "Documentation for texlive-grid-system"
DESCRIPTION = "This package includes the documentation for texlive-grid-system"
LICENSE = "Apache-1.0"

PV = "2023.209.0.0.3.0svn32981"

RPM_NAME = "texlive-grid-system-doc-2023.209.0.0.3.0svn32981-54.2.noarch.rpm"
RPM_HASH = "bb2fd6c0a44be268039a92e665b78e140588d05de66084de612d522702e0d3bffb8de47ae3091e4bfdd9a2c7cd23fdd57d1fa4efe5dbd765a323a30dd2bc0b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grid-system-doc"

RDEPENDS:${PN} += ""

inherit rpm
