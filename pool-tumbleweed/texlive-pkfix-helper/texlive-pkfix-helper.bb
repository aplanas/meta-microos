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

PV = "2023.209.1.6svn56061"

RPM_NAME = "texlive-pkfix-helper-2023.209.1.6svn56061-52.1.noarch.rpm"
RPM_HASH = "75e1a3df391e37944460909998e4cc531e99db740491f71d786f0a15682aa53e066495f4e55787360d833e3e2364704d619874c1c16e010e610ec196fb69716f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pkfix-helper"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
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
