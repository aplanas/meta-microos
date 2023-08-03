SUMMARY = "Support software for downscaling graphics to be included by pdfLaTeX"
DESCRIPTION = "The package provides a script to scale pictures down to a \
target resolution before creating a PDF document with pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.32svn46617"

RPM_NAME = "texlive-pdflatexpicscale-2023.209.0.0.32svn46617-52.1.noarch.rpm"
RPM_HASH = "e80bb13ca965620f4ba6670e54559b7d681b3875f58319b24fee39f3ed99d1826eef9da3626f584facf2b75ff4b3663b14b17ae886c852b7bedae31d5a570171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdflatexpicscale"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-File--Copy \
perl-File--Spec \
perl-Getopt--Long \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdflatexpicscale-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
