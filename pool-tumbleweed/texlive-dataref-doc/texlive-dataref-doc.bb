SUMMARY = "Documentation for texlive-dataref"
DESCRIPTION = "This package includes the documentation for texlive-dataref"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn62942"

RPM_NAME = "texlive-dataref-doc-2023.209.0.0.7svn62942-55.1.noarch.rpm"
RPM_HASH = "323a3ef99ed859e8d40043c7ae90204cbfbe7ff7c4026b50bbea7da46af0d99d6833adfcf1f7c773f047e3db46ddf77eaa575708ce7d8f0ebfbff5a68448a008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dataref-doc"

RDEPENDS:${PN} += ""

inherit rpm
