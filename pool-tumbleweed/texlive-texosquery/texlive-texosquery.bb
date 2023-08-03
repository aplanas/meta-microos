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

PV = "2023.209.1.7svn53676"

RPM_NAME = "texlive-texosquery-2023.209.1.7svn53676-55.1.noarch.rpm"
RPM_HASH = "c821da1b130af36b81e653c5da306396e81c7e5d4e8ca8c74567fd0c944daf5e36ddee191ac356d56a67818d3314787f8eeb2d33b3d4da85e29fb242603bed3a"
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
