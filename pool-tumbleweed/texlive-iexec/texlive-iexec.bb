SUMMARY = "Execute shell commands and input their output"
DESCRIPTION = "With the help of the \\iexec command, you can execute a shell \
command and then input its output into your document. This \
package also lets you use any special symbols inside your \
command."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11.4svn64908"

RPM_NAME = "texlive-iexec-2023.209.0.0.11.4svn64908-54.1.noarch.rpm"
RPM_HASH = "73519ad6787319b8762bb7863d91564680a35b2210cd63438e9c6c04a2c9947c837ca93f31a1bca0d10436fb5ad43bac73131bfb2bdbbb8565ad9b6997750c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iexec.sty \
texlive-iexec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pgfkeys.sty \
tex-shellesc.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-xkeyval"

inherit rpm
