SUMMARY = "Documentation for texlive-lpform"
DESCRIPTION = "This package includes the documentation for texlive-lpform"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn36918"

RPM_NAME = "texlive-lpform-doc-2023.201.svn36918-54.1.noarch.rpm"
RPM_HASH = "0f640f2d323bd69299a22b8becce3957f38906cffeae1540fb0ba4fd91d1709d1709d27c707d667a967b3e60252ad6dbeee7ed9fecd89fe66a00cb769a2f041e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lpform-doc"
RDEPENDS:${PN} += ""

inherit rpm
