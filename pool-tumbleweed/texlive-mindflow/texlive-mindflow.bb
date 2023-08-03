SUMMARY = "Write your ideas in a clear way"
DESCRIPTION = "This package provides an environment that has its own line \
numbers or markers and can be well distinguished from the main \
text, for writing your ideas or annotations."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65236"

RPM_NAME = "texlive-mindflow-2023.209.svn65236-55.1.noarch.rpm"
RPM_HASH = "f0adc16a1214ce468a2c324c1d27856bbe31688ebf6f551729fa97fd092e8b62a9abdfe7a3b6d03577ff8c6e4b71ce95b40eebca1ec2134c3249b4cded2a38ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mindflow.sty \
texlive-mindflow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-lineno.sty \
tex-nowidow.sty \
tex-tcolorbox.sty \
tex-verbatim.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
