SUMMARY = "Documentation for texlive-asana-math"
DESCRIPTION = "This package includes the documentation for texlive-asana-math"
LICENSE = "OFL-1.1"

PV = "2023.209.0.000.958svn59629"

RPM_NAME = "texlive-asana-math-doc-2023.209.0.000.958svn59629-54.1.noarch.rpm"
RPM_HASH = "002b0dadb92851f462a1d70b47c5a8dd352cf3f6551f768031dab72a459b7a075f6812a72d8392ee26a2812c20c7ca88d9eea443ede966a6f15b2e62ff6e84fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asana-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
