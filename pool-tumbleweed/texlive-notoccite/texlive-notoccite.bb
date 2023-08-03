SUMMARY = "Prevent trouble from citations in table of contents, etcetera"
DESCRIPTION = "If you have \\cite commands in \\section-like commands, or in \
\\caption, the citation will also appear in the table of \
contents, or list of whatever. If you are also using an \
unsrt-like bibliography style, these citations will come at the \
very start of the bibliography, which is confusing. This \
package suppresses the effect."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn18129"

RPM_NAME = "texlive-notoccite-2023.209.svn18129-55.1.noarch.rpm"
RPM_HASH = "35d2d5e0946c8dacdfb5b65b1712c3a5acfd56263e365321a30af337037e695dc3950291f47cffa84dadf2a0f0958aaba5d93aa19be6913f0636838fd7427b54"
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
