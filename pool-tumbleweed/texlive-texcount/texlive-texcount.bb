SUMMARY = "Count words in a LaTeX document"
DESCRIPTION = "TeXcount is a Perl script that counts words in the text of \
LaTeX files. It has rules for handling most of the common \
macros, and can provide colour-coded output showing which parts \
of the text have been counted. The package script is available \
as a Web service via its home page."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.1svn49013"

RPM_NAME = "texlive-texcount-2023.201.3.1.1svn49013-54.1.noarch.rpm"
RPM_HASH = "478d661dfd05c2d2bf9791f69b18111e396e435f21a80c297ae844e67d91919f3b9686c1c3ebe009b82f94944c7ee06dce3e42b523ca6616aa85495390cbc8a9"
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
