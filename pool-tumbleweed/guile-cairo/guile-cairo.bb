SUMMARY = "Guile bindings to Cairo"
DESCRIPTION = "Guile bindings to Cairo library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "guile-cairo-1.11.2-1.3.aarch64.rpm"
RPM_HASH = "210175b98d1f1d83c864effd2918e3a844d1de9254ca934093996f2fc27cf7fa843d5806f7d85ca395af4730ecaff89ce5ef3011999cdac0c68420c04d91ccfd"

RPROVIDES:${PN} += "guile-cairo \
guile-cairo(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libguile-cairo0"

inherit rpm
