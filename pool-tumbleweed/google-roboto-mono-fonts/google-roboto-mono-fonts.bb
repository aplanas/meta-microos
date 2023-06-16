SUMMARY = "Google Roboto Mono fonts"
DESCRIPTION = "Roboto Mono is a monospaced addition to the Roboto type family. Like the \
other members of the Roboto family, the fonts are optimized for readability \
on screens across a wide variety of devices and reading environments. While \
the monospaced version is related to its variable width cousin, it doesn't \
hesitate to change forms to better fit the constraints of a monospaced \
environment. For example, narrow glyphs like 'I', 'l' and 'i' have added \
serifs for more even texture while wider glyphs are adjusted for weight. \
Curved caps like 'C' and 'O' take on the straighter sides from Roboto \
Condensed."
LICENSE = "Apache-2.0"

PV = "20160111"

RPM_NAME = "google-roboto-mono-fonts-20160111-2.6.noarch.rpm"
RPM_HASH = "7e223f809e51b06c04d32aa59ff186af92c0210894ab12c2eee25c98067dc3c68a9b343feeb72cd5aa814b7292604ac6521a57fc3a1b30f448dc4abdee2461c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-roboto-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
