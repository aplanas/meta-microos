SUMMARY = "Documentation for texlive-apalike-ejor"
DESCRIPTION = "This package includes the documentation for texlive-apalike-ejor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn59667"

RPM_NAME = "texlive-apalike-ejor-doc-2023.201.1.2.0svn59667-54.1.noarch.rpm"
RPM_HASH = "12828d6847ef929747a155db2ac43eb5f4e0dae209840233c63d86f7ef5b191b16b3448924bcb4c57ff5a5dd92fcf3bbb7be89aa5a0ca71ddd29d0eec968eee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-ejor-doc"
RDEPENDS:${PN} += ""

inherit rpm
