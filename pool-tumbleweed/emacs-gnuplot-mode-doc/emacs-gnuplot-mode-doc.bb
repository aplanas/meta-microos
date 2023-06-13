SUMMARY = "Documentation for EMACS Gnuplot mode"
DESCRIPTION = "This package contains the Gnuplot mode documentation in PDF format."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "emacs-gnuplot-mode-doc-0.7.0-1.9.noarch.rpm"
RPM_HASH = "299bd097e7f0e9b2e381ff245304e63d31a80e93242f84bbe9105c3d67f4cbb5cffdb8aa3c57c47e5dd8e456f116f33e9351357c3171b9615c28ff5cf7d6a7e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-gnuplot-mode-doc"

RDEPENDS:${PN} += ""

inherit rpm
