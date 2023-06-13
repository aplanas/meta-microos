SUMMARY = "Documentation for texlive-chicago-annote"
DESCRIPTION = "This package includes the documentation for texlive-chicago-annote"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-chicago-annote-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "4e03e878fcf763d94fbde776ea3168686d29d13b30337899d73c1dd46ac32e4ef944f051a72f43094616161e9631af1b7caf7fa5c3114320de7a5450c196a5c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chicago-annote-doc"

RDEPENDS:${PN} += ""

inherit rpm
