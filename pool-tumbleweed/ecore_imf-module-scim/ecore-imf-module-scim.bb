SUMMARY = "SCIM module for Ecore"
DESCRIPTION = "SCIM input method module for Ecore."
LICENSE = "BSD-2-Clause"

PV = "1.26.3"

RPM_NAME = "ecore_imf-module-scim-1.26.3-30.6.aarch64.rpm"
RPM_HASH = "26dee629032671c380c833cc7c59ddacc026ea92a03e1d0cd1f9eeba7e54ac0455d340228d04bd9e5a5083ccf27779d137e45136552663b3d131f7155bc44c2d"

RPROVIDES:${PN} += "ecore-imf-module-scim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libecore-evas.so.1 \
libecore-imf.so.1 \
libecore-x.so.1 \
libecore.so.1 \
libeina.so.1 \
libevas.so.1 \
libgcc-s.so.1 \
libscim-1.0.so.8 \
libstdc++.so.6"

inherit rpm
