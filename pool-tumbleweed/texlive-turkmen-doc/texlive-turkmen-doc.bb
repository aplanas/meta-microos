SUMMARY = "Documentation for texlive-turkmen"
DESCRIPTION = "This package includes the documentation for texlive-turkmen"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn17748"

RPM_NAME = "texlive-turkmen-doc-2023.209.0.0.2svn17748-53.1.noarch.rpm"
RPM_HASH = "2c4de5593a32ed6f60853bf49192d98f1d2e9df7c96513f805ea69fb8281530a58f09960955027b1f3219a6de70af7cf8aff411f8a76e9406d95ddaf2a59f13d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turkmen-doc"

RDEPENDS:${PN} += ""

inherit rpm
