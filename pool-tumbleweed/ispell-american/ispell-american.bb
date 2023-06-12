SUMMARY = "American ispell dictionary"
DESCRIPTION = "This package includes a ready American dictionary for ispell. If you \
install ispell-british too, check /etc/sysconfig/ispell to see which \
one the default English dictionary will be. A short usage description \
is given in /usr/share/doc/packages/ispell/README. The sources for this \
dictionary are included in the source package of ispell."
LICENSE = "BSD-3-Clause"

PV = "3.4.05"

RPM_NAME = "ispell-american-3.4.05-1.3.aarch64.rpm"
RPM_HASH = "3aa15b7d063fca73a9dc5a8e4982f502d34b14254ea40e309c926f7a03c4ee76630daecec19f039d56c27bdfbc970ec0faeee18ff483bf76ccb0ca404409c5e9"

RPROVIDES:${PN} += "iamerica \
ispell-american \
ispell-american(aarch-64) \
ispell_dictionary \
ispell_english_dictionary \
locale(ispell:en)"
RDEPENDS:${PN} += "/bin/sh \
bash \
fileutils"

inherit rpm
