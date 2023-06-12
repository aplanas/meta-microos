SUMMARY = "Noto Sans Japanese Font - All Weights"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains All weights for \
Sans fonts for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-fonts-full-2.004-3.3.noarch.rpm"
RPM_HASH = "a6af4384d314127f3db46113ff414eea22c95df35bd27be8f9e43c2dc720c7ac70db721eb51cd016e2140423ad406f428bc58eca8074753aa1df65d9d37ada2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-fonts-full \
noto-sans-jp-fonts-full"
RDEPENDS:${PN} += "google-noto-sans-jp-black-fonts \
google-noto-sans-jp-demilight-fonts \
google-noto-sans-jp-fonts \
google-noto-sans-jp-light-fonts \
google-noto-sans-jp-medium-fonts \
google-noto-sans-jp-thin-fonts"

inherit rpm
