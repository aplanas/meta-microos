SUMMARY = "A monospaced font, with support files for use with TeX"
DESCRIPTION = "Inconsolata is a monospaced font designed by Raph Levien. This \
package contains the font (in both Adobe Type 1 and OpenType \
formats) in regular and bold weights, with additional glyphs \
and options to control slashed zero, upright quotes and a \
shapelier lower-case L, plus metric files for use with TeX, and \
LaTeX font definition and other relevant files."
LICENSE = "OFL-1.1"

PV = "2023.201.1.121svn54512"

RPM_NAME = "texlive-inconsolata-2023.201.1.121svn54512-52.1.noarch.rpm"
RPM_HASH = "68e362f5db5c5377e4daca578ab61f4ce215b5987f703e9b598ad5963b6fc308915afe7255e7b36ec3677e74a18d04283dbd6a6fd825d922e72740d0064cb3bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-i4-ly1-0.enc \
tex-i4-ly1-1.enc \
tex-i4-ly1-2.enc \
tex-i4-ly1-3.enc \
tex-i4-ly1-4.enc \
tex-i4-ly1-5.enc \
tex-i4-ly1-6.enc \
tex-i4-ly1-7.enc \
tex-i4-ot1-0.enc \
tex-i4-ot1-1.enc \
tex-i4-ot1-2.enc \
tex-i4-ot1-3.enc \
tex-i4-ot1-4.enc \
tex-i4-ot1-5.enc \
tex-i4-ot1-6.enc \
tex-i4-ot1-7.enc \
tex-i4-qx-0.enc \
tex-i4-qx-1.enc \
tex-i4-qx-2.enc \
tex-i4-qx-3.enc \
tex-i4-qx-4.enc \
tex-i4-qx-5.enc \
tex-i4-qx-6.enc \
tex-i4-qx-7.enc \
tex-i4-t1-0.enc \
tex-i4-t1-1.enc \
tex-i4-t1-2.enc \
tex-i4-t1-3.enc \
tex-i4-t1-4.enc \
tex-i4-t1-5.enc \
tex-i4-t1-6.enc \
tex-i4-t1-7.enc \
tex-i4-ts1.enc \
tex-inconsolata.sty \
tex-ly1-zi4b-0.tfm \
tex-ly1-zi4b-1.tfm \
tex-ly1-zi4b-2.tfm \
tex-ly1-zi4b-3.tfm \
tex-ly1-zi4b-4.tfm \
tex-ly1-zi4b-5.tfm \
tex-ly1-zi4b-6.tfm \
tex-ly1-zi4b-7.tfm \
tex-ly1-zi4nb-0.tfm \
tex-ly1-zi4nb-1.tfm \
tex-ly1-zi4nb-2.tfm \
tex-ly1-zi4nb-3.tfm \
tex-ly1-zi4nb-4.tfm \
tex-ly1-zi4nb-5.tfm \
tex-ly1-zi4nb-6.tfm \
tex-ly1-zi4nb-7.tfm \
tex-ly1-zi4nr-0.tfm \
tex-ly1-zi4nr-1.tfm \
tex-ly1-zi4nr-2.tfm \
tex-ly1-zi4nr-3.tfm \
tex-ly1-zi4nr-4.tfm \
tex-ly1-zi4nr-5.tfm \
tex-ly1-zi4nr-6.tfm \
tex-ly1-zi4nr-7.tfm \
tex-ly1-zi4r-0.tfm \
tex-ly1-zi4r-1.tfm \
tex-ly1-zi4r-2.tfm \
tex-ly1-zi4r-3.tfm \
tex-ly1-zi4r-4.tfm \
tex-ly1-zi4r-5.tfm \
tex-ly1-zi4r-6.tfm \
tex-ly1-zi4r-7.tfm \
tex-ly1zi4.fd \
tex-ot1-zi4b-0.tfm \
tex-ot1-zi4b-1.tfm \
tex-ot1-zi4b-2.tfm \
tex-ot1-zi4b-3.tfm \
tex-ot1-zi4b-4.tfm \
tex-ot1-zi4b-5.tfm \
tex-ot1-zi4b-6.tfm \
tex-ot1-zi4b-7.tfm \
tex-ot1-zi4nb-0.tfm \
tex-ot1-zi4nb-1.tfm \
tex-ot1-zi4nb-2.tfm \
tex-ot1-zi4nb-3.tfm \
tex-ot1-zi4nb-4.tfm \
tex-ot1-zi4nb-5.tfm \
tex-ot1-zi4nb-6.tfm \
tex-ot1-zi4nb-7.tfm \
tex-ot1-zi4nr-0.tfm \
tex-ot1-zi4nr-1.tfm \
tex-ot1-zi4nr-2.tfm \
tex-ot1-zi4nr-3.tfm \
tex-ot1-zi4nr-4.tfm \
tex-ot1-zi4nr-5.tfm \
tex-ot1-zi4nr-6.tfm \
tex-ot1-zi4nr-7.tfm \
tex-ot1-zi4r-0.tfm \
tex-ot1-zi4r-1.tfm \
tex-ot1-zi4r-2.tfm \
tex-ot1-zi4r-3.tfm \
tex-ot1-zi4r-4.tfm \
tex-ot1-zi4r-5.tfm \
tex-ot1-zi4r-6.tfm \
tex-ot1-zi4r-7.tfm \
tex-ot1zi4.fd \
tex-qx-zi4b-0.tfm \
tex-qx-zi4b-1.tfm \
tex-qx-zi4b-2.tfm \
tex-qx-zi4b-3.tfm \
tex-qx-zi4b-4.tfm \
tex-qx-zi4b-5.tfm \
tex-qx-zi4b-6.tfm \
tex-qx-zi4b-7.tfm \
tex-qx-zi4nb-0.tfm \
tex-qx-zi4nb-1.tfm \
tex-qx-zi4nb-2.tfm \
tex-qx-zi4nb-3.tfm \
tex-qx-zi4nb-4.tfm \
tex-qx-zi4nb-5.tfm \
tex-qx-zi4nb-6.tfm \
tex-qx-zi4nb-7.tfm \
tex-qx-zi4nr-0.tfm \
tex-qx-zi4nr-1.tfm \
tex-qx-zi4nr-2.tfm \
tex-qx-zi4nr-3.tfm \
tex-qx-zi4nr-4.tfm \
tex-qx-zi4nr-5.tfm \
tex-qx-zi4nr-6.tfm \
tex-qx-zi4nr-7.tfm \
tex-qx-zi4r-0.tfm \
tex-qx-zi4r-1.tfm \
tex-qx-zi4r-2.tfm \
tex-qx-zi4r-3.tfm \
tex-qx-zi4r-4.tfm \
tex-qx-zi4r-5.tfm \
tex-qx-zi4r-6.tfm \
tex-qx-zi4r-7.tfm \
tex-qxzi4.fd \
tex-t1-zi4b-0.tfm \
tex-t1-zi4b-1.tfm \
tex-t1-zi4b-2.tfm \
tex-t1-zi4b-3.tfm \
tex-t1-zi4b-4.tfm \
tex-t1-zi4b-5.tfm \
tex-t1-zi4b-6.tfm \
tex-t1-zi4b-7.tfm \
tex-t1-zi4nb-0.tfm \
tex-t1-zi4nb-1.tfm \
tex-t1-zi4nb-2.tfm \
tex-t1-zi4nb-3.tfm \
tex-t1-zi4nb-4.tfm \
tex-t1-zi4nb-5.tfm \
tex-t1-zi4nb-6.tfm \
tex-t1-zi4nb-7.tfm \
tex-t1-zi4nr-0.tfm \
tex-t1-zi4nr-1.tfm \
tex-t1-zi4nr-2.tfm \
tex-t1-zi4nr-3.tfm \
tex-t1-zi4nr-4.tfm \
tex-t1-zi4nr-5.tfm \
tex-t1-zi4nr-6.tfm \
tex-t1-zi4nr-7.tfm \
tex-t1-zi4r-0.tfm \
tex-t1-zi4r-1.tfm \
tex-t1-zi4r-2.tfm \
tex-t1-zi4r-3.tfm \
tex-t1-zi4r-4.tfm \
tex-t1-zi4r-5.tfm \
tex-t1-zi4r-6.tfm \
tex-t1-zi4r-7.tfm \
tex-t1zi4.fd \
tex-ts1-zi4b.tfm \
tex-ts1-zi4nb.tfm \
tex-ts1-zi4nr.tfm \
tex-ts1-zi4r.tfm \
tex-ts1zi4.fd \
tex-zi4.map \
tex-zi4.sty \
texlive-inconsolata"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-textcomp.sty \
tex-updmap.cfg \
tex-upquote.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-inconsolata-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
