SUMMARY = "Alternate quotes between double and single with nesting"
DESCRIPTION = "Provides two new commands: \\nlq and \\nrq for nesting left and \
right quotes that properly change between double and single \
quotes according to their nesting level. For example, the input \
\\nlq Foo \\nlq bar\\nrq\\ bletch\\nrq will be typeset as if it had \
been entered as 'Foo 'bar' bletch'."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn27323"

RPM_NAME = "texlive-nestquot-2023.209.svn27323-55.1.noarch.rpm"
RPM_HASH = "330fd43449c1433cd0e0471bcd03557cdc4a31ee90e06b6e187ffe50b8bc3ea522acae81007532332a2fae97eb89982801654ac0e7e47df796714d9663b99590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nestquot.sty \
texlive-nestquot"

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
