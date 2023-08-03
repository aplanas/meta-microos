SUMMARY = "Unicode font encoding definitions for XeTeX"
DESCRIPTION = "Font encoding definitions for unicode fonts loaded by LaTeX in \
XeTeX or LuaTeX. The package provides two encodings: EU1, \
designed for use with XeTeX, which the fontspec uses for \
unicode fonts which require no macro-level processing for \
accents, and EU2, which provides the same facilities for use \
with LuaTeX. Neither encoding places any restriction on the \
glyphs provided by a font; use of EU2 causes the package \
euxunicode to be loaded (the package is part of this \
distribution). The package includes font definition files for \
use with the Latin Modern OpenType fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1hsvn19795"

RPM_NAME = "texlive-euenc-2023.209.0.0.1hsvn19795-53.1.noarch.rpm"
RPM_HASH = "051a665550f1474990ae8fc04096c987679d17930087572eeaeb4ed27b85e3a43d237ff0114ae9d1d32c227d369df942abf5f4ef39d12c73432de8522c902282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eu1enc.def \
tex-eu1lmdh.fd \
tex-eu1lmr.fd \
tex-eu1lmss.fd \
tex-eu1lmssq.fd \
tex-eu1lmtt.fd \
tex-eu1lmvtt.fd \
tex-eu2enc.def \
tex-eu2lmdh.fd \
tex-eu2lmr.fd \
tex-eu2lmss.fd \
tex-eu2lmssq.fd \
tex-eu2lmtt.fd \
tex-eu2lmvtt.fd \
texlive-euenc"

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
