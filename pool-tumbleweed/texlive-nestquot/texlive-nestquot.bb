SUMMARY = "Alternate quotes between double and single with nesting"
DESCRIPTION = "Provides two new commands: \\nlq and \\nrq for nesting left and \
right quotes that properly change between double and single \
quotes according to their nesting level. For example, the input \
\\nlq Foo \\nlq bar\\nrq\\ bletch\\nrq will be typeset as if it had \
been entered as 'Foo 'bar' bletch'."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn27323"

RPM_NAME = "texlive-nestquot-2023.201.svn27323-54.1.noarch.rpm"
RPM_HASH = "3ee84777dd8c44418f04449b568bd4f9f51b66a6094aadf9d9c2902fb117e2fce22b7145e099d8f3129c0182bba6605e23c924f585ec2ffe2d30b85307fcfa95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nestquot.sty \
texlive-nestquot"

RDEPENDS:${PN} += "/bin/sh \
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
