SUMMARY = "Cross-platform Java application to query OS information"
DESCRIPTION = "This package provides a cross-platform Java application to \
query OS information designed for use in TeX's shell escape \
mechanism. The application can query the following: locale and \
codeset current working directory user home directory temporary \
directory OS name, arch and version Current date and time in \
PDF format (for TeX formats that don't provide \
\\pdfcreationdate) Date-time stamp of a file in PDF format (for \
TeX formats that don't provide \\pdffilemoddate) Size of a file \
in bytes (for TeX formats that don't provide \\pdffilesize) \
Contents of a directory (captured as a list) Directory contents \
filtered by regular expression (captured as a list) URI of a \
file Canonical path of a file All paths use a forward slash as \
directory divider so results can be used, for example, in \
commands like \\includegraphics. There are files provided for \
easy access in TeX documents: texosquery.tex: generic TeX code \
texosquery.sty: LaTeX package This provides commands to run \
texosquery using TeX's shell escape mechanism and capture the \
result in a control sequence. The category code of most of \
TeX's default special characters (and some other potentially \
problematic characters) is temporarily changed to 12 while \
reading the result."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn53676"

RPM_NAME = "texlive-texosquery-2023.201.1.7svn53676-54.1.noarch.rpm"
RPM_HASH = "db0c308d89c557586d82e768410850d027c1ffa92b88e0552f2f76c9f3bc26b2b74e100d8436869dae957393d66ca052ac024901cfc9bdf77bb16188411545f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texosquery-jre5.jar \
tex-texosquery-jre8.jar \
tex-texosquery.cfg \
tex-texosquery.jar \
tex-texosquery.sty \
tex-texosquery.tex \
texlive-texosquery"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texosquery-bin"

inherit rpm
