SUMMARY = "Make PostScript files accessible to pkfix"
DESCRIPTION = "Pkfix is a useful utility for replacing resolution-dependent \
bitmapped fonts in a dvips-produced PostScript file with the \
corresponding resolution-independent vector fonts. \
Unfortunately, pkfix needs to parse certain PostScript comments \
that appear only in files produced by dvips versions later than \
5.58 (ca. 1996); it fails to work on PostScript files produced \
by older versions of dvips. Pkfix-helper is a program that \
attempts to insert newer-dvips comments into an older-dvips \
PostScript file, thereby making the file suitable for \
processing by pkfix. pkfix-helper can sometimes process \
documents fully autonomously but does require the user to \
verify and, if needed, correct its decisions."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn56061"

RPM_NAME = "texlive-pkfix-helper-2023.201.1.6svn56061-51.1.noarch.rpm"
RPM_HASH = "a637f5d4faad64cdb20ad3e6a4dc5159572b544899a22b6c2c725c9f1b5ff5aafc9c48ee2f1d5add157a3a423f1f57e1c6378180dd90080eedbc3ebdb606777b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pkfix-helper"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-File--Spec \
perl-File--Temp \
perl-Getopt--Long \
perl-Pod--Usage \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pkfix-helper-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
