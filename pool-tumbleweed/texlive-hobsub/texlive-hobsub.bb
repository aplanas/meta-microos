SUMMARY = "Construct package bundles"
DESCRIPTION = "Heiko Oberdiek's hobsub package (and hobsub-hyperref and \
hobsub-generic packages) defined a mechanism for concatenating \
multiple files into a single file for faster loading. The \
disadvantage is that it introduces hard dependencies between \
the source files that are included and complicates distribution \
and updates. It was principally used with hyperref but is not \
currently used in any standard packages in TeX Live. The \
packages are still distributed as simple stubs that reference \
the included packages via \\RequirePackage rather than copying \
their source. The documented source of the original packages is \
available at github, but is not distributed to CTAN."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn52810"

RPM_NAME = "texlive-hobsub-2023.209.svn52810-54.1.noarch.rpm"
RPM_HASH = "76e323eea920266a5512c53f653d1ca762d42dc57b6d6eb28d66735a5f148bb8cabf4d35905df77812865d3d30291eb641945a56a0ecb5cc2393011426e371d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hobsub-generic.sty \
tex-hobsub-hyperref.sty \
tex-hobsub.sty \
texlive-hobsub"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-auxhook.sty \
tex-bigintcalc.sty \
tex-etexcmds.sty \
tex-hycolor.sty \
tex-iftex.sty \
tex-ifvtex.sty \
tex-infwarerr.sty \
tex-intcalc.sty \
tex-keyval.sty \
tex-kvdefinekeys.sty \
tex-kvsetkeys.sty \
tex-letltxmacro.sty \
tex-ltxcmds.sty \
tex-pdfescape.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
