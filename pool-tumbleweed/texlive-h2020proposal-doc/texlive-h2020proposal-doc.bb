SUMMARY = "Documentation for texlive-h2020proposal"
DESCRIPTION = "This package includes the documentation for texlive-h2020proposal"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn38428"

RPM_NAME = "texlive-h2020proposal-doc-2023.209.1.0svn38428-54.2.noarch.rpm"
RPM_HASH = "9fcd1f6252d8077618d8c54c1466ff8f45427dd154d0497ea68003dd32111bdbf0215cf14fcf2ef2afbc061855199520c349fd121537b12007eda85be82fa739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-h2020proposal-doc"

RDEPENDS:${PN} += ""

inherit rpm
