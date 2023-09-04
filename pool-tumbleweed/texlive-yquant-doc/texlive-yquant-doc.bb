SUMMARY = "Documentation for texlive-yquant"
DESCRIPTION = "This package includes the documentation for texlive-yquant"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.3svn65933"

RPM_NAME = "texlive-yquant-doc-2023.209.0.0.7.3svn65933-53.2.noarch.rpm"
RPM_HASH = "dd820050c6b3bafd14559a336f9f8d7ef42d6358518976580d5becafafe5ce14331fa3b171b2582e7b9ffda8c23e54f786bd01a71f18f4d8af641ab9ab31716b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yquant-doc"

RDEPENDS:${PN} += ""

inherit rpm
