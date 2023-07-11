SUMMARY = "Documentation for EMACS Gnuplot mode"
DESCRIPTION = "This package contains the Gnuplot mode documentation in PDF format."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "emacs-gnuplot-mode-doc-0.7.0-1.10.noarch.rpm"
RPM_HASH = "3416638bf858a0222ec290a6f6fd00c5b60b9537301fc4d76421388c01c50f2f1896e0cbac0abcf0cd868285e7c39902b7f503c3c1be7ebb4fe3a1c4491effce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-gnuplot-mode-doc"

RDEPENDS:${PN} += ""

inherit rpm
