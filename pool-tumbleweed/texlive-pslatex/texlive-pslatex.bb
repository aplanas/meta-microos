SUMMARY = "Use PostScript fonts by default"
DESCRIPTION = "A small package that makes LaTeX default to 'standard' \
PostScript fonts. It is basically a merger of the times and the \
(obsolete) mathptm packages from the psnfss suite. You must \
have installed standard LaTeX and the psnfss PostScript fonts \
to use this package. The main novel feature is that the pslatex \
package tries to compensate for the visual differences between \
the Adobe fonts by scaling Helvetica by 90%, and 'condensing' \
Courier (i.e. scaling horizontally) by 85%. The package is \
supplied with a (unix) shell file for a 'pslatex' command that \
allows standard LaTeX documents to be processed, without \
needing to edit the file. Note that current psnfss uses a \
different technique for scaling Helvetica, and treats Courier \
as a lost cause (there are better free fixed-width available \
now, than there were when pslatex was designed). As a result, \
pslatex is widely considered obsolete."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn57434"

RPM_NAME = "texlive-pslatex-2023.201.1.3svn57434-52.1.noarch.rpm"
RPM_HASH = "d0dadb7760a666838fc737fb8c10bc8a0d1b6b84940446fe4538e13230d4ef00266837e5a0ce61fede4b775254b55d1b1730739f67eb40612030ac323b6e26b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pcrr7tn.tfm) \
tex(pcrr7tn.vf) \
tex(pcrr8rn.map) \
tex(pcrr8rn.tfm) \
tex(pcrr8tn.tfm) \
tex(pcrr8tn.vf) \
tex(pslatex.sty) \
texlive-pslatex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(psyr.tfm) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
