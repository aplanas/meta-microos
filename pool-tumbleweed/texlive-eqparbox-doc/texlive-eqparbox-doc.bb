SUMMARY = "Documentation for texlive-eqparbox"
DESCRIPTION = "This package includes the documentation for texlive-eqparbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1svn45215"

RPM_NAME = "texlive-eqparbox-doc-2023.209.4.1svn45215-54.2.noarch.rpm"
RPM_HASH = "369c1930abcb801b50ea6bc8c83664dddfb2ecae5a173a7f9876184b0878d430a8008a2cfd566c064c660a05f15fbcb665adb31ef06cf0c417c9990b1d093f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqparbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
