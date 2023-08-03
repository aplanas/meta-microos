SUMMARY = "Documentation for texlive-ebsthesis"
DESCRIPTION = "This package includes the documentation for texlive-ebsthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-ebsthesis-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "5f4cf5d93a1913719b7a84e12163ba6fa18ba589fc820c5c0d5d4a02bf2568395cf0f917fa2e058daaefd75cf194ea4a7cf305c0acc40332d7d5eacf0857525f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebsthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
