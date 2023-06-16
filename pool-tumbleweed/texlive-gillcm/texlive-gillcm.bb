SUMMARY = "Alternative unslanted italic Computer Modern fonts"
DESCRIPTION = "This is a demonstration of the use of virtual fonts for unusual \
effects: the package implements an old idea of Eric Gill. The \
package was written for the author's talk at TUG 2010."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.1svn19878"

RPM_NAME = "texlive-gillcm-2023.201.1.1svn19878-52.1.noarch.rpm"
RPM_HASH = "1a002e756f0d7769e8de374a63b0d84d7346c596a82ec4eee3e8dc3bc878ea706516248c9ad65bb95a03664f8439c653b9eacc5195087df15b8e9d8acad7eb11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmg.map \
tex-cmgb8r.tfm \
tex-cmgbi7t.tfm \
tex-cmgbi7t.vf \
tex-cmgbi8c.tfm \
tex-cmgbi8c.vf \
tex-cmgbi8r.tfm \
tex-cmgbi8t.tfm \
tex-cmgbi8t.vf \
tex-cmgbiu7t.tfm \
tex-cmgbiu7t.vf \
tex-cmgbiu8c.tfm \
tex-cmgbiu8c.vf \
tex-cmgbiu8r.tfm \
tex-cmgbiu8t.tfm \
tex-cmgbiu8t.vf \
tex-cmgm8r.tfm \
tex-cmgmi7t.tfm \
tex-cmgmi7t.vf \
tex-cmgmi8c.tfm \
tex-cmgmi8c.vf \
tex-cmgmi8r.tfm \
tex-cmgmi8t.tfm \
tex-cmgmi8t.vf \
tex-cmgmiu7t.tfm \
tex-cmgmiu7t.vf \
tex-cmgmiu8c.tfm \
tex-cmgmiu8c.vf \
tex-cmgmiu8r.tfm \
tex-cmgmiu8t.tfm \
tex-cmgmiu8t.vf \
tex-gillcm.sty \
tex-ot1cmg.fd \
tex-t1cmg.fd \
tex-ts1cmg.fd \
texlive-gillcm"

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
