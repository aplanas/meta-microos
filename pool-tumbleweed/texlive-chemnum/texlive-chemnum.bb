SUMMARY = "A method for numbering chemical compounds"
DESCRIPTION = "The package defines a \\label- and \\ref-like commands for \
compound numbers. The package requires LaTeX3 packages expl3 \
(from the l3kernel bundle) as well as xparse and l3keys2e (from \
the l3packages bundle)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn57490"

RPM_NAME = "texlive-chemnum-2023.201.1.3asvn57490-53.1.noarch.rpm"
RPM_HASH = "ca10d628451a6ba83466cf9828fab30cc2f0a5e6adc064d3faa73e55d4116b27af7045acec8e0d4de9bc2d34c4d7304004a7be6ee0f7aa9d053f3a1a3816ecfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemnum.sty \
texlive-chemnum"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chemgreek.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-psfrag.sty \
tex-translations.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
