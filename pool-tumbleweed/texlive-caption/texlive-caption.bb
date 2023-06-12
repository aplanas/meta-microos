SUMMARY = "Customising captions in floating environments"
DESCRIPTION = "The caption package provides many ways to customise the \
captions in floating environments like figure and table, and \
cooperates with many other packages. Facilities include \
rotating captions, sideways captions, continued captions (for \
tables or figures that come in several parts). A list of \
compatibility notes, for other packages, is provided in the \
documentation. The package also provides the 'caption outside \
float' facility, in the same way that simpler packages like \
capt-of do. The package supersedes caption2."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66580"

RPM_NAME = "texlive-caption-2023.201.svn66580-52.1.noarch.rpm"
RPM_HASH = "da66185c2e1ebb9d7dbfc13d8214fead09f52fb32403f1272cdcb34710e2c80df3edf0a83723cdac871919b6ec0eb4b6590c89eaf097fa010860ceaa561055ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bicaption.sty) \
tex(caption-light.sty) \
tex(caption.sty) \
tex(caption2.sty) \
tex(caption2_1995-10-09.sty) \
tex(caption2_2005-10-03.sty) \
tex(caption3.sty) \
tex(caption3_2007-04-11.sty) \
tex(caption3_2010-01-14.sty) \
tex(caption3_2011-11-01.sty) \
tex(caption3_2019-09-01.sty) \
tex(caption3_2020-07-29.sty) \
tex(caption3_2020-10-26.sty) \
tex(caption_1995-04-05.sty) \
tex(caption_2007-04-16.sty) \
tex(caption_2010-01-09.sty) \
tex(caption_2011-11-10.sty) \
tex(caption_2019-09-01.sty) \
tex(caption_2020-07-29.sty) \
tex(caption_2020-10-26.sty) \
tex(ltcaption.sty) \
tex(subcaption.sty) \
texlive-caption"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
tex(newfloat.sty) \
tex(ragged2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
