SUMMARY = "Binary files of latex-papersize"
DESCRIPTION = "Binary files of latex-papersize"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn42296"

RPM_NAME = "texlive-latex-papersize-bin-2023.20230311.svn42296-93.1.aarch64.rpm"
RPM_HASH = "f385c55e589c7cc69f3e022620685498dd7f28138915637f98294bea3c7e5e22a6bdf92658ea3468f99ce69cbf0fac30a48f805092267cfd2536c2bf55d0c07e"

RPROVIDES:${PN} += "texlive-latex-papersize-bin"

RDEPENDS:${PN} += "texlive-latex-papersize"

inherit rpm
