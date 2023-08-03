SUMMARY = "Documentation for texlive-fjodor"
DESCRIPTION = "This package includes the documentation for texlive-fjodor"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn53207"

RPM_NAME = "texlive-fjodor-doc-2023.209.svn53207-53.1.noarch.rpm"
RPM_HASH = "b522b7eef1a99cce483c211e4a35ad574a5e6a2e8df0cb7521b69aa18199799caab5bdfa4e3b99cc17f0a855f093a74430f0f08086e64215c5e73cf09d4e40a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fjodor-doc"

RDEPENDS:${PN} += ""

inherit rpm
