SUMMARY = "Documentation for texlive-threeddice"
DESCRIPTION = "This package includes the documentation for texlive-threeddice"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn20675"

RPM_NAME = "texlive-threeddice-doc-2023.209.1.0svn20675-55.1.noarch.rpm"
RPM_HASH = "ea457a8979c70317738e30c09397c666754857b14d35f8e485f76bae32c2b73d243075b7bc3aed2c252f739e14debf6e7776b888ead293a855f33e3b824cd628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeddice-doc"

RDEPENDS:${PN} += ""

inherit rpm
