SUMMARY = "Documentation for texlive-fancytooltips"
DESCRIPTION = "This package includes the documentation for texlive-fancytooltips"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn56291"

RPM_NAME = "texlive-fancytooltips-doc-2023.201.1.8svn56291-52.1.noarch.rpm"
RPM_HASH = "b4a00338ceccecd1ca3b3a22666caa60ded7d1009e674d6713a2c09b52482e4dafa51da8a57438363f1e034757efcddb0ba5f0e13bdb90c44b73f446ae7b783e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancytooltips-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
