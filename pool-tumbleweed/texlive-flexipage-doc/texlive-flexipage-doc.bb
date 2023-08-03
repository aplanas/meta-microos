SUMMARY = "Documentation for texlive-flexipage"
DESCRIPTION = "This package includes the documentation for texlive-flexipage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn64572"

RPM_NAME = "texlive-flexipage-doc-2023.209.1.01svn64572-53.1.noarch.rpm"
RPM_HASH = "b18e0aa71914f4d188e1745c9586418c8b735b7ff8f143145894930e368d83a19a4c88dadda8182c2557d6c8b0246fced31aec685ebbe0371641bc6a89df75dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flexipage-doc"

RDEPENDS:${PN} += ""

inherit rpm
