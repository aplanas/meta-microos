SUMMARY = "Fully automated LaTeX document generation"
DESCRIPTION = "Latexmk completely automates the process of generating a LaTeX \
document. Given the source files for a document, latexmk issues \
the appropriate sequence of commands to generate a .dvi, .ps, \
.pdf or hardcopy version of the document. An important feature \
is the 'preview continuous mode', where the script watches all \
of the source files (primary file and included TeX and graphics \
files), and reruns LaTeX, etc., whenever a source file has \
changed. Thus a previewer can offer a display of the document's \
latest state."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.79svn65485"

RPM_NAME = "texlive-latexmk-2023.201.4.79svn65485-54.1.noarch.rpm"
RPM_HASH = "0ff9e4e1c0e51594a2c400c87023cb98d2d5916d4c0a8ae0bac722846ad75119d6da0a13ac4066d6d302ee4e247181927fdf61403834d617b40f49e6830458eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-latexmk) \
texlive-latexmk"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Config) \
perl(Cwd) \
perl(Digest::MD5) \
perl(Encode) \
perl(File::Basename) \
perl(File::Copy) \
perl(File::Find) \
perl(File::Glob) \
perl(File::Path) \
perl(File::Spec::Functions) \
perl(FileHandle) \
perl(List::Util) \
perl(Time::HiRes) \
perl(Unicode::Normalize) \
perl(feature) \
perl(sigtrap) \
perl(utf8) \
perl(vars) \
perl(warnings) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latexmk-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
