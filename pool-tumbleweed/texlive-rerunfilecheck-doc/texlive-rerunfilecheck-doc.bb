SUMMARY = "Documentation for texlive-rerunfilecheck"
DESCRIPTION = "This package includes the documentation for texlive-rerunfilecheck"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn63869"

RPM_NAME = "texlive-rerunfilecheck-doc-2023.209.1.10svn63869-54.1.noarch.rpm"
RPM_HASH = "f0da8b644c3ff3079795e0936982e9c8500242ea9be37b5422f0d2377deccf1069d4b581aaa3c13e8688aa93012737a3620243d5162513e5a0f4f787711df597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rerunfilecheck-doc"

RDEPENDS:${PN} += ""

inherit rpm
