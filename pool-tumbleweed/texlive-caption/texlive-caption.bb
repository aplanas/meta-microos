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

PV = "2023.209.svn66580"

RPM_NAME = "texlive-caption-2023.209.svn66580-53.1.noarch.rpm"
RPM_HASH = "12794c349cacc24dc93c602c810e51d1c61e24327f53196c35b8fc03e7443725eb555e5dd42c311c700fe3ac7a3b7cb084a4df9db6619e48f012302a10d83180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bicaption.sty \
tex-caption-1995-04-05.sty \
tex-caption-2007-04-16.sty \
tex-caption-2010-01-09.sty \
tex-caption-2011-11-10.sty \
tex-caption-2019-09-01.sty \
tex-caption-2020-07-29.sty \
tex-caption-2020-10-26.sty \
tex-caption-light.sty \
tex-caption.sty \
tex-caption2-1995-10-09.sty \
tex-caption2-2005-10-03.sty \
tex-caption2.sty \
tex-caption3-2007-04-11.sty \
tex-caption3-2010-01-14.sty \
tex-caption3-2011-11-01.sty \
tex-caption3-2019-09-01.sty \
tex-caption3-2020-07-29.sty \
tex-caption3-2020-10-26.sty \
tex-caption3.sty \
tex-ltcaption.sty \
tex-subcaption.sty \
texlive-caption"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-newfloat.sty \
tex-ragged2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
