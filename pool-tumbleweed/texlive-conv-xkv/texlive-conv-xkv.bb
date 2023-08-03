SUMMARY = "Create new key-value syntax"
DESCRIPTION = "This small package supports key-value syntax other than the \
standard LaTeX syntax of <key>=<value>. Using this package, \
create key-values of the form <key>:<value> or <key>-><value>, \
for example. The package converts the new notation to xkeyval \
notation and passes it on to xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43558"

RPM_NAME = "texlive-conv-xkv-2023.209.svn43558-55.1.noarch.rpm"
RPM_HASH = "83ce80512b30f590ab293a2f343736470e81bf3e96aeaecfd1ba31fb59778fe4317e476f32a2c149b0747eb1bf61b87b3a4eb5982c771f2c73aa6ce3417ce522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-conv-xkv.sty \
texlive-conv-xkv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
