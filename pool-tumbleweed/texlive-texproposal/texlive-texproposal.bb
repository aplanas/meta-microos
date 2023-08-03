SUMMARY = "A proposal prototype for LaTeX promotion in Chinese universities"
DESCRIPTION = "This package contains the original source code and necessary \
attachment of the document 'Proposal for Offering TeX Courses \
and Relevant Resources in Chongqing University'. This proposal \
could be helpful if one is considering to suggest his/her \
university or company to use TeX (or LaTeX, or XeLaTeX) as a \
typesetting system, especially for Chinese universities and \
companies. The present proposal mainly explains the importance \
and necessity of introducing TeX, a typesetting system often \
used in academic writing, to students and teachers. This \
proposal starts from a brief introduction of TeX, then steps \
further into its fascinating application to academic writing \
and dissertation formatting. Finally, a set of possible \
implementation strategies with regard to the proper \
introduction of TeX and relevant resources to our university, \
is proposed."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn43151"

RPM_NAME = "texlive-texproposal-2023.209.1.4svn43151-55.1.noarch.rpm"
RPM_HASH = "08359b10567ea6ae0d558e41818ff01ec6147784b06b02e11e83f9209072e3a8386f02f3e6b273714738cafbfd12544cbc1f4821e619cd0fa1e7dffb739cbf6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texproposal"

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
