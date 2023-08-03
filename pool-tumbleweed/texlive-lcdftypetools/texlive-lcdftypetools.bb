SUMMARY = "A bundle of outline font manipulation tools"
DESCRIPTION = "This bundle of tools comprises: Cfftot1, which translates a \
Compact Font Format (CFF) font, or a PostScript-flavored \
OpenType font, into PostScript Type 1 format. It correctly \
handles subroutines and hints; Mmafm and mmpfb, which create \
instances of multiple-master fonts (mmafm and mmpfb were \
previously distributed in their own package, mminstance); \
Otfinfo, which reports information about OpenType fonts, such \
as the features they support and the contents of their 'size' \
optical size features; Otftotfm, which creates TeX font metrics \
and encodings that correspond to a PostScript-flavored OpenType \
font. It will interpret glyph positionings, substitutions, and \
ligatures as far as it is able. You can say which OpenType \
features should be activated; T1dotlessj, creates a Type 1 font \
whose only character is a dotless j matching the input font's \
design; T1lint, which checks a Type 1 font for correctness; \
T1reencode, which replaces a font's internal encoding with one \
you specify; and T1testpage, which creates a PostScript proof \
for a Type 1 font. It is preliminary software."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn52851"

RPM_NAME = "texlive-lcdftypetools-2023.209.svn52851-55.1.noarch.rpm"
RPM_HASH = "c046cd389e4a3f0dd0eae7bffcba20f6b582d9bedf747ef83815c40b8337431e6ec201005e20df59823382d4153387651f8d7bf7f0033041818d1158ccd94479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-cfftot1.1 \
man-mmafm.1 \
man-mmpfb.1 \
man-otfinfo.1 \
man-otftotfm.1 \
man-t1dotlessj.1 \
man-t1lint.1 \
man-t1rawafm.1 \
man-t1reencode.1 \
man-t1testpage.1 \
man-ttftotype42.1 \
texlive-lcdftypetools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-glyphlist \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lcdftypetools-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
