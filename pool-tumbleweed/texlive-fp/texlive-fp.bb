SUMMARY = "Fixed point arithmetic"
DESCRIPTION = "An extensive collection of arithmetic operations for fixed \
point real numbers of high precision."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1dsvn49719"

RPM_NAME = "texlive-fp-2023.201.2.1dsvn49719-52.1.noarch.rpm"
RPM_HASH = "60721f0a8dc1f4131b0feafe591ad45aa392f3791ddd82bd2bcb08c5a5df5bd755513c34586885009cc7857f491d53fe8f86553a71effd42dbe195f4f600220e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(defpattern.sty) \
tex(fp-addons.sty) \
tex(fp-basic.sty) \
tex(fp-eqn.sty) \
tex(fp-eval.sty) \
tex(fp-exp.sty) \
tex(fp-pas.sty) \
tex(fp-random.sty) \
tex(fp-snap.sty) \
tex(fp-trigo.sty) \
tex(fp-upn.sty) \
tex(fp.sty) \
tex(fp.tex) \
tex(lfp.sty) \
texlive-fp"
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
