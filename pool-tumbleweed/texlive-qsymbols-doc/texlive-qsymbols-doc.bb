SUMMARY = "Documentation for texlive-qsymbols"
DESCRIPTION = "This package includes the documentation for texlive-qsymbols"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-qsymbols-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "d35c226bf79bf02ef4da4700eba4860583bf93d95ebf7a60dbeeef452e5504301cfeeaa62f48f10acbef35410d965c1f460d420eb2c77a200b9a9659d07b4fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qsymbols-doc"
RDEPENDS:${PN} += ""

inherit rpm
