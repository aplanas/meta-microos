SUMMARY = "Documentation for texlive-functan"
DESCRIPTION = "This package includes the documentation for texlive-functan"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-functan-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "7973895d29868f0f93a3adb3267afe8108a75be450d027a7e4881700e45f455b6a1d5bea2b04e7088d940b7bed4c2f28aa3e619c56639da2482d9f7e3e9d860b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-functan-doc"

RDEPENDS:${PN} += ""

inherit rpm
