SUMMARY = "Theorem environments that are shaded"
DESCRIPTION = "Extends the \\newtheorem command. If you say \
\\newshadetheorem{theorem}{Theorem} in the preamble then your \
regular \\begin{theorem} .. \\end{theorem} will produce a theorem \
statement in a shaded box. It supports all the options of \
\\newtheorem, including forms \\newshadetheorem{..}[..]{..} and \
\\newshadetheorem{..}{..}[..]. Environments declared using the \
package require their body to remain on one page; the mdframed \
package can frame and shade theorems, and its environments \
break at the end of a page; users are generally recommended, \
therefore, to use mdframed. In the same spirit, the author told \
us in January 2020: 'These materials are obsolete. There are a \
number of more recent, more powerful packages that have \
capabilities that greatly extend the simple ones here. A new \
project should use one of those. These files only continue to \
be available to help people who are working with an old \
project.'"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53350"

RPM_NAME = "texlive-shadethm-2023.209.svn53350-54.1.noarch.rpm"
RPM_HASH = "608436bd3c6afb4503b5b6a5a57efa27813a8ffa9b44303bf8d057d004a28d46e6c9f90d6bb16605ab28bce6dc17220827d1c5c650d519566e5b6ee2ec021dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shadethm.sty \
texlive-shadethm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
