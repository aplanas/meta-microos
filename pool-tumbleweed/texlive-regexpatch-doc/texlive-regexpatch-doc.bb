SUMMARY = "Documentation for texlive-regexpatch"
DESCRIPTION = "This package includes the documentation for texlive-regexpatch"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2fsvn58668"

RPM_NAME = "texlive-regexpatch-doc-2023.209.0.0.2fsvn58668-54.2.noarch.rpm"
RPM_HASH = "7d41d981593489256551ed0278bfe7225a71e22bf3784125f867fff9c7517410895e673109c0562bb7bea4c12c1c6eee5268ba4758577cc23d3f184366847e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regexpatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
