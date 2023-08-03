SUMMARY = "Utility scripts and support files for typesetting Korean"
DESCRIPTION = "The bundle provides scripts and support files for index \
generation in Korean language typesetting. The files belong to \
the ko.TeX bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn38727"

RPM_NAME = "texlive-kotex-utils-2023.209.2.1.0svn38727-56.1.noarch.rpm"
RPM_HASH = "e91c97471b0bab3cc201d7662d00707f41bd5ea367fea1523fd8088d7732ebbc462f9cf651facfdd844f418826bcd3824a3bd5a0041e597c1b50c0c51110f8a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kotex-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Copy \
perl-File--Path \
perl-Getopt--Std \
sed \
texlive \
texlive-filesystem \
texlive-kotex-utf \
texlive-kotex-utils-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
