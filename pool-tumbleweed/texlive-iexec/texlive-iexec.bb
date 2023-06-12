SUMMARY = "Execute shell commands and input their output"
DESCRIPTION = "With the help of the \\iexec command, you can execute a shell \
command and then input its output into your document. This \
package also lets you use any special symbols inside your \
command."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11.4svn64908"

RPM_NAME = "texlive-iexec-2023.201.0.0.11.4svn64908-52.1.noarch.rpm"
RPM_HASH = "7f85259a4f4ca7b7de986fa68dcc6930d7fef70cf7955383d865e8cdb0a2d72703d9053beaca672bd198b96e6381abcc877e0f824138cd7fa94a433799135f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(iexec.sty) \
texlive-iexec"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(pgfkeys.sty) \
tex(shellesc.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-xkeyval"

inherit rpm
