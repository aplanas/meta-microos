SUMMARY = "Provides an environment that may be conditionally included"
DESCRIPTION = "This package provides an environment to switch a section of \
code on or off. The code may be placed anywhere in the file (it \
is not limited to the document or the preamble). The motivation \
for this package was to have commands which allow preselection \
based on whether sections of code in a preamble of a template \
are executed."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn34481"

RPM_NAME = "texlive-codesection-2023.201.0.0.1svn34481-53.1.noarch.rpm"
RPM_HASH = "f7ee0868a5c3930fe45ea2c15d91d045e28cb94dc5a47625667aa289157a08c1c1b9a2a4aaba596a84ebe942579dd9541551d3e5f9be4274187e50794bd37f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codesection.sty \
texlive-codesection"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
