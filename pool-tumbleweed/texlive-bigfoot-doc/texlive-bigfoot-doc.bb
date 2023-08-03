SUMMARY = "Documentation for texlive-bigfoot"
DESCRIPTION = "This package includes the documentation for texlive-bigfoot"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1svn38248"

RPM_NAME = "texlive-bigfoot-doc-2023.209.2.1svn38248-54.1.noarch.rpm"
RPM_HASH = "e175750f9f8abf00a19ec1bb3ae7513f56beff689d282b6f3336a76e7804de0e740786e9ea1cd0d9af0fdd911128f9f7161f6f375d31ac2bc6d6ca1d391a8640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bigfoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
