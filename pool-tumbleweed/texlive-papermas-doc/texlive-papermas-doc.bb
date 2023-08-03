SUMMARY = "Documentation for texlive-papermas"
DESCRIPTION = "This package includes the documentation for texlive-papermas"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn23667"

RPM_NAME = "texlive-papermas-doc-2023.209.1.0hsvn23667-52.1.noarch.rpm"
RPM_HASH = "6f8091b118ccc15040334aba661067f282967aa04bb726cd553fc0b4a05f07951477f342cadbf0d2cedfcfb6e7331c42ee5705cd72dcef7bd18c841091f58bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-papermas-doc"

RDEPENDS:${PN} += ""

inherit rpm
