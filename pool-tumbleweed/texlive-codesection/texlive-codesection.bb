SUMMARY = "Provides an environment that may be conditionally included"
DESCRIPTION = "This package provides an environment to switch a section of \
code on or off. The code may be placed anywhere in the file (it \
is not limited to the document or the preamble). The motivation \
for this package was to have commands which allow preselection \
based on whether sections of code in a preamble of a template \
are executed."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn34481"

RPM_NAME = "texlive-codesection-2023.209.0.0.1svn34481-54.1.noarch.rpm"
RPM_HASH = "7634b9c391a9dde6c0c1a73d1f4f955ceebcacaa2f08b2f759b80597c9376bb9782c442bf5ab9977f114b80684356356d93a333563a4a5142f3b51594468d8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codesection.sty \
texlive-codesection"

RDEPENDS:${PN} += "/usr/bin/sh \
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
