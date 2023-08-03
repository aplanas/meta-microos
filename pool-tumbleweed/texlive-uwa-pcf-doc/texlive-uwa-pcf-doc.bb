SUMMARY = "Documentation for texlive-uwa-pcf"
DESCRIPTION = "This package includes the documentation for texlive-uwa-pcf"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn64491"

RPM_NAME = "texlive-uwa-pcf-doc-2023.209.1.0.1svn64491-54.1.noarch.rpm"
RPM_HASH = "a35e556f2fd4ca5518d27cf7d1b7f62d65a0c12c696e9571f1231e7a15eca57c476a95efa5c9597272d046d3a7c7ef6337702ed016db9df5e716331ea1587c86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-pcf-doc"

RDEPENDS:${PN} += ""

inherit rpm
