SUMMARY = "Documentation for texlive-esint"
DESCRIPTION = "This package includes the documentation for texlive-esint"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2dsvn52240"

RPM_NAME = "texlive-esint-doc-2023.209.1.2dsvn52240-54.2.noarch.rpm"
RPM_HASH = "81215684bdc115067c08011ed84563081aeccdb8052c37d53ba31ec19c7294b585ea50774eb9411c6af48cc09d89e3ac24e24063e3abac21152219a21e5aeed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esint-doc"

RDEPENDS:${PN} += ""

inherit rpm
