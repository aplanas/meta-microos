SUMMARY = "Documentation for texlive-byo-twemojis"
DESCRIPTION = "This package includes the documentation for texlive-byo-twemojis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn58917"

RPM_NAME = "texlive-byo-twemojis-doc-2023.209.1.0svn58917-53.1.noarch.rpm"
RPM_HASH = "5b94f0ace2007950845542da0f24149fdb66ca9a1bbce1441acd0a8f7abad72be1029ac3372274eb1716c72b845f3b19b6238f66bd13c90d43dae3eedb91a939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-byo-twemojis-doc"

RDEPENDS:${PN} += ""

inherit rpm
