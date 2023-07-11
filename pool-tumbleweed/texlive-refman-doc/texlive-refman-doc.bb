SUMMARY = "Documentation for texlive-refman"
DESCRIPTION = "This package includes the documentation for texlive-refman"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0esvn15878"

RPM_NAME = "texlive-refman-doc-2023.201.2.0esvn15878-53.2.noarch.rpm"
RPM_HASH = "8b05507785dc67429f7110e1913ce5e3ba38aeb54adebd94a95c1773af4e715036bdd4694fd6d2e09f6910f4cb9366e4ee6a40aecb6d086c72bbce919ef540e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-refman-doc-de;en \
texlive-refman-doc"

RDEPENDS:${PN} += ""

inherit rpm
