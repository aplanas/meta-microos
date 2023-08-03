SUMMARY = "Documentation for texlive-tikz-bayesnet"
DESCRIPTION = "This package includes the documentation for texlive-tikz-bayesnet"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn38295"

RPM_NAME = "texlive-tikz-bayesnet-doc-2023.209.0.0.1svn38295-55.1.noarch.rpm"
RPM_HASH = "a13536494d5e2caf918f11cab038d6c42c8d9bbf5982f2158631969cd589f487c270df20f832e60a368f3757baa9ac7fb3896b857175d205124c83e700e1aa80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-bayesnet-doc"

RDEPENDS:${PN} += ""

inherit rpm
