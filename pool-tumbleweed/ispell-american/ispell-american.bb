SUMMARY = "American ispell dictionary"
DESCRIPTION = "This package includes a ready American dictionary for ispell. If you \
install ispell-british too, check /etc/sysconfig/ispell to see which \
one the default English dictionary will be. A short usage description \
is given in /usr/share/doc/packages/ispell/README. The sources for this \
dictionary are included in the source package of ispell."
LICENSE = "BSD-3-Clause"

PV = "3.4.05"

RPM_NAME = "ispell-american-3.4.05-1.4.aarch64.rpm"
RPM_HASH = "c11b2f862341643e794cb3402dce6064e4c5f89ef3dd367c338081ef1175c4e2c64ee8c97c214c78bc1b1a317f8ccf6b37df0425fe704116601b576c1664a01f"

RPROVIDES:${PN} += "iamerica \
ispell-american \
ispell-dictionary \
ispell-english-dictionary \
locale-ispell-en"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
fileutils"

inherit rpm
