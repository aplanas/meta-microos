SUMMARY = "Sans Serif Font"
DESCRIPTION = "'Nobile' is designed to work with the technologies of digital \
screens and handheld devices without losing the distinctive look \
more usually found in fonts designed for printing. Going back to \
William Morris's baseline 'Have nothing in your house that you do \
not know to be useful, or believe to be beautiful', the aim was to \
design a font that could function well, have good legibility on \
screen yet also be good loooking, not only at larger display sizes \
but also right down to small text sizes. \
 \
Designer: Vernon Adams"
LICENSE = "OFL-1.1"

PV = "1.0.38"

RPM_NAME = "google-nobile-fonts-1.0.38-11.17.noarch.rpm"
RPM_HASH = "642c9d296771f0cda4efef4fc94e15b1218bc0a760c2121fd83df77a13f6c1fc684c5792a701f24e47435b39f8efe404eade9cd9ad2795d33033a5a7e159ea58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-nobile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
