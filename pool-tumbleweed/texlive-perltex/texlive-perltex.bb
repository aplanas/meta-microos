SUMMARY = "Define LaTeX macros in terms of Perl code"
DESCRIPTION = "PerlTeX is a combination Perl script (perltex.pl) and LaTeX2e \
package (perltex.sty) that, together, give the user the ability \
to define LaTeX macros in terms of Perl code. Once defined, a \
Perl macro becomes indistinguishable from any other LaTeX \
macro. PerlTeX thereby combines LaTeX's typesetting power with \
Perl's programmability. PerlTeX will make use of persistent \
named pipes, and thereby run more efficiently, on operating \
systems that offer them (mostly Unix-like systems). Also \
provided is a switch to generate a PerlTeX-free, \
document-specific, noperltex.sty that is useful when \
distributing a document to places where PerlTeX is not \
available."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn52162"

RPM_NAME = "texlive-perltex-2023.209.2.2svn52162-52.1.noarch.rpm"
RPM_HASH = "e16ca345b7c9f39e358c90c0a768bf43206c96138974837566ad21eca5b7b809f5b1ddc42ee5a99e5f12caf5c7f16fc43bf6e1c7f4656ec979306f84dc472a6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-perltex.sty \
texlive-perltex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Fcntl \
perl-File--Basename \
perl-File--Spec \
perl-Getopt--Long \
perl-IO--Handle \
perl-Opcode \
perl-POSIX \
perl-Pod--Usage \
perl-Safe \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-perltex-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
