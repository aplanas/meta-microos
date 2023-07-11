SUMMARY = "Execute shell commands and input their output"
DESCRIPTION = "With the help of the \\iexec command, you can execute a shell \
command and then input its output into your document. This \
package also lets you use any special symbols inside your \
command."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.11.4svn64908"

RPM_NAME = "texlive-iexec-2023.208.0.0.11.4svn64908-53.1.noarch.rpm"
RPM_HASH = "0f82d5c83a83233b83cf72fc39fefa0fb26ae11a91605f4f0a373aa2adecd1fcee6f12818bfa346d6f56a668dcdc9518930292e144a93d99f06b4f49e076a9d6"
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
