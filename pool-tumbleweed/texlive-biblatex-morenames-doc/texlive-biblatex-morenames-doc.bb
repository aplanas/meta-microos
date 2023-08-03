SUMMARY = "Documentation for texlive-biblatex-morenames"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-morenames"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.1svn43049"

RPM_NAME = "texlive-biblatex-morenames-doc-2023.209.1.3.1svn43049-54.1.noarch.rpm"
RPM_HASH = "633b582fbb205fe779e318b9e4d29aba1afdb6ab1a916b52df22f3996b9ff501ca9ff960b92cfbe176ad65ababbc6fa4baa0f94bc21535357ccd671f968d820d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-morenames-doc"

RDEPENDS:${PN} += "/usr/bin/python"

inherit rpm
