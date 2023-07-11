SUMMARY = "Documentation for texlive-xtab"
DESCRIPTION = "This package includes the documentation for texlive-xtab"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3fsvn23347"

RPM_NAME = "texlive-xtab-doc-2023.201.2.3fsvn23347-52.2.noarch.rpm"
RPM_HASH = "a047a7396fddb5838dd8f121973c423647aedeab6c4c3601fdec9296be976cf24c25a7a76d8fb9d0849c5f4d258ee10d8eb82e0c6ba7359ba455e6c6eafcf338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xtab-doc"

RDEPENDS:${PN} += ""

inherit rpm
