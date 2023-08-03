SUMMARY = "M4 macros for electric circuit diagrams"
DESCRIPTION = "A set of m4 macros for drawing high-quality electric circuits \
containing fundamental elements, amplifiers, transistors, and \
basic logic gates to include in TeX, LaTeX, or similar \
documents. Some tools and examples for other types of diagrams \
are also included. The macros can be evaluated to drawing \
commands in the pic language, which is very easy to understand \
and which has a good power/complexity ratio. Pic contains \
elements of a simple programming language, and is well-suited \
to line drawings requiring parametric or conditional \
components, fine tuning, significant geometric calculations or \
repetition, or that are naturally block structured or tree \
structured. (The m4 and pic processors are readily available \
for Unix and PC machines.) Alternative output macros can create \
TeX output to be read by pstricks, TikZ commands for use by the \
pgf bundle, or SVG."
LICENSE = "LPPL-1.0"

PV = "2023.209.10.2svn66549"

RPM_NAME = "texlive-circuit-macros-2023.209.10.2svn66549-54.1.noarch.rpm"
RPM_HASH = "37a178f14aeba031cf33e86b3cbe89b45609264bd045f59b5680e867dc962719d7219c000f9e399c0396e2ef7580f764cef1ebed6d4e322017f2caafe0cc23e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boxdims.sty \
texlive-circuit-macros"

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
