SUMMARY = "Documentation for texlive-isorot"
DESCRIPTION = "This package includes the documentation for texlive-isorot"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-isorot-doc-2023.201.svn15878-55.1.noarch.rpm"
RPM_HASH = "8a1fac44ca1f9428bca98dd49d61eae64fd12809a652866ab009e9bbd13588ede09ef1dadfa24b855a4a34f73b998dceffe6674feca7a10409dce973bc7aa83f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isorot-doc"

RDEPENDS:${PN} += ""

inherit rpm
