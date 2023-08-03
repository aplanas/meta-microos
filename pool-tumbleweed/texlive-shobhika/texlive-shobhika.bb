SUMMARY = "An OpenType Devanagari font designed for scholars"
DESCRIPTION = "This package provides a free, open source, Unicode compliant, \
OpenType font with support for Devanagari, Latin, and Cyrillic \
scripts. It is available in two weights--regular and bold. The \
font is designed with over 1600 Devanagari glyphs, including \
support for over 1100 conjunct consonants, as well as vedic \
accents. The Latin component of the font not only supports a \
wide range of characters required for Roman transliteration of \
Sanskrit, but also provides a subset of regularly used \
mathematical symbols for scholars working with scientific and \
technical documents. The project has been launched under the \
auspices of the Science and Heritage Initiative (SandHI) at IIT \
Bombay, and builds upon the following two fonts for its \
Devanagari and Latin components respectively: (i) Yashomudra by \
Rajya Marathi Vikas Samstha, and (ii) PT Serif by ParaType. We \
would like to thank both these organisations for releasing \
their fonts under the SIL Open Font Licence, which has enabled \
us to create Shobhika."
LICENSE = "OFL-1.1"

PV = "2023.209.1.05svn50555"

RPM_NAME = "texlive-shobhika-2023.209.1.05svn50555-54.1.noarch.rpm"
RPM_HASH = "024a8f46e1e6abf52c78f9cbe0133d5969fe9a6b69708be1f64cb9867c1df8eed6e62bbcb4c5de4007a0811dcf25a9920bdbf05dd3515ab97c252a5e2dea69b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shobhika"

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
texlive-scripts-bin \
texlive-shobhika-fonts"

inherit rpm
