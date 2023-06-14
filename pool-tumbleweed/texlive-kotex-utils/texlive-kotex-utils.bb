SUMMARY = "Utility scripts and support files for typesetting Korean"
DESCRIPTION = "The bundle provides scripts and support files for index \
generation in Korean language typesetting. The files belong to \
the ko.TeX bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn38727"

RPM_NAME = "texlive-kotex-utils-2023.201.2.1.0svn38727-55.1.noarch.rpm"
RPM_HASH = "470292faa10c73a9aa4be9d8098587f7001bc234e87e2babf8ebacb8e402ebdda2f160cc698d61faeab249a02e2b6c8b16b6457a004d625839cac891cc4c7f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kotex-utils"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
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
