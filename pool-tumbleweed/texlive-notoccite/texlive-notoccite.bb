SUMMARY = "Prevent trouble from citations in table of contents, etcetera"
DESCRIPTION = "If you have \\cite commands in \\section-like commands, or in \
\\caption, the citation will also appear in the table of \
contents, or list of whatever. If you are also using an \
unsrt-like bibliography style, these citations will come at the \
very start of the bibliography, which is confusing. This \
package suppresses the effect."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn18129"

RPM_NAME = "texlive-notoccite-2023.201.svn18129-54.1.noarch.rpm"
RPM_HASH = "1dea1d9b7d85f473005489f2a5afe26529fac13f34a1126da5cfc62a1b53584b76d78e612fba49ad1d4fdf0fc5e14d83f07a779d29083a37f5e5dd92e4553db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-notoccite.sty \
texlive-notoccite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
