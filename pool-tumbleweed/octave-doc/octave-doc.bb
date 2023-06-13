SUMMARY = "Documentation for Octave"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
This package contains documentation for Octave."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "octave-doc-8.2.0-1.1.noarch.rpm"
RPM_HASH = "d6eecfe524e8fc41da8f57449eefe6bf8f4f24a0441809460037fe2f35418e7cf10e7390ca36218feeb2ea63025a39df2df93a57cfb9b2d353ce1e54faa12498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-doc"

RDEPENDS:${PN} += ""

inherit rpm
