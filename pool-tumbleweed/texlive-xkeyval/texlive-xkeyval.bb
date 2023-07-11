SUMMARY = "Extension of the keyval package"
DESCRIPTION = "This package is an extension of the keyval package and offers \
additional macros for setting keys and declaring and setting \
class or package options. The package allows the programmer to \
specify a prefix to the name of the macros it defines for keys, \
and to define families of key definitions; these all help use \
in documents where several packages define their own sets of \
keys."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.9svn63616"

RPM_NAME = "texlive-xkeyval-2023.201.2.9svn63616-52.2.noarch.rpm"
RPM_HASH = "163f71d13b1dac9ea33b599e0ebd28c496dcfd56651707a3bd09a73458b59ab129d19db49eb67afcd34cd8022579adb51bb47620bdc771f93db11fd0c433e768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyval.tex \
tex-pst-xkey.sty \
tex-pst-xkey.tex \
tex-xkeyval.sty \
tex-xkeyval.tex \
tex-xkvltxp.sty \
tex-xkvtxhdr.tex \
tex-xkvutils.tex \
tex-xkvview.sty \
texlive-xkeyval"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
