SUMMARY = "Development headers for the InChI library"
DESCRIPTION = "This package contains the development files for the InChI library."
LICENSE = "LGPL-2.0-or-later"

PV = "1.06"

RPM_NAME = "inchi-devel-1.06-2.3.aarch64.rpm"
RPM_HASH = "3ab68af812deb00b954df92c790af3ee0177c47ae4bfce450850452ff191925f816259b7992b9c04e5e1922e81bd15fbbd6c5379d6fc3febd31830c1d0ade14e"

RPROVIDES:${PN} += "inchi-devel \
inchi-devel(aarch-64)"

RDEPENDS:${PN} += "libinchi1"

inherit rpm
