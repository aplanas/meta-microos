SUMMARY = "Documentation for texlive-gothic"
DESCRIPTION = "This package includes the documentation for texlive-gothic"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn49869"

RPM_NAME = "texlive-gothic-doc-2023.209.svn49869-54.1.noarch.rpm"
RPM_HASH = "085527f93ea1b3ad7d63f3089ff6979403bf7a7fa0915492ba4a9e9003dc33741155d7648435c9a75e577cbdf0ca57f59a3e11d1ba4eeef9f8cd325cfa3ec0c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gothic-doc"

RDEPENDS:${PN} += ""

inherit rpm
