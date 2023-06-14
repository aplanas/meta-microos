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

PV = "2023.201.10.2svn66549"

RPM_NAME = "texlive-circuit-macros-2023.201.10.2svn66549-53.1.noarch.rpm"
RPM_HASH = "fa7ee44bb71928f8bf60d79d8a78ed174ee4dfca080c0593dd7ee9547c7d29a0a76f9613af2ade6b6d4862c997c731dbe263233543a345c8a8e42cab8b86a4e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boxdims.sty \
texlive-circuit-macros"

RDEPENDS:${PN} += "/bin/sh \
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
