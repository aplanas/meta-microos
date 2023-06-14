SUMMARY = "Noto Sans Japanese Font - Thin"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Thin weight of \
Sans font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-thin-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "4dae2ad51fb552b6a3cceefd068eb52d77537576c9054e532e2390136fc520ab752ef477907a6c3b19cc9d6da91a594c759a28dbead9dd9283718be84a7972e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-thin-fonts \
noto-sans-jp-thin-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
