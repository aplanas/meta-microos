SUMMARY = "British ispell dictionary"
DESCRIPTION = "This packages includes a ready British dictionary for ispell. If you \
install ispell-american too, check /etc/sysconfig/ispell to see which \
one will be the default English dictionary. A short usage description \
is given in /usr/share/doc/packages/ispell/README. The sources for this \
dictionary are included in the source package of ispell."
LICENSE = "BSD-3-Clause"

PV = "3.4.05"

RPM_NAME = "ispell-british-3.4.05-1.4.aarch64.rpm"
RPM_HASH = "6d74810b0f7836383fae8e8c6e8b1a880fb7529c80815c4bded5b57ee6274a6860e3b7254783a9c1bd88d6b389cd668048cbf4c2c22e88a22f3fe83913667d5c"

RPROVIDES:${PN} += "ibritish \
ispell-british \
ispell-dictionary \
ispell-english-dictionary \
locale-ispell-en-GB"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
fileutils"

inherit rpm
