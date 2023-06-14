SUMMARY = "Documentation for texlive-scratchx"
DESCRIPTION = "This package includes the documentation for texlive-scratchx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44906"

RPM_NAME = "texlive-scratchx-doc-2023.201.1.1svn44906-53.1.noarch.rpm"
RPM_HASH = "fa40def6780e7f25fb1776c3759a12db2f70f588d1c241342bab03203fad2aa65837d50a55111ddf35ee765cdf517855e539a7e5af4305a147471f8705f9365d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scratchx-doc-fr \
texlive-scratchx-doc"

RDEPENDS:${PN} += ""

inherit rpm
