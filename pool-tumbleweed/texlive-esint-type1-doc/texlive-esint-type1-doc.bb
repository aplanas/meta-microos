SUMMARY = "Documentation for texlive-esint-type1"
DESCRIPTION = "This package includes the documentation for texlive-esint-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-esint-type1-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "7b0f27bf0fb938277e27d445729c2a4b705d2e2c9653a18a75422e0cb83351131b7d85d32d7f401265e6d3ee73a61632aa3db1e27f3038b854826df9dc0faa4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esint-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
