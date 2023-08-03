SUMMARY = "Count words in a LaTeX document"
DESCRIPTION = "TeXcount is a Perl script that counts words in the text of \
LaTeX files. It has rules for handling most of the common \
macros, and can provide colour-coded output showing which parts \
of the text have been counted. The package script is available \
as a Web service via its home page."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.1svn49013"

RPM_NAME = "texlive-texcount-2023.209.3.1.1svn49013-55.1.noarch.rpm"
RPM_HASH = "97646330ab4e2a84fcb6e5e6d9e9187c33d961765ee814a5b25820a41d5efa03f4db9ca853e6a45435b319c9388d98eb9d618e21b5811d77a2657ac340d5f333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texcount"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Encode \
perl-Term--ANSIColor \
perl-Text--Wrap \
perl-strict \
perl-utf8 \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texcount-bin"

inherit rpm
