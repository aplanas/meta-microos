SUMMARY = "GTK+ 2 Theme Engines"
DESCRIPTION = "This package installs the theme engine libraries for GTK+ 2."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engines-2.20.2-19.43.aarch64.rpm"
RPM_HASH = "b47b95728a8f5b7fee7e81fae3d45c70db508e274719d207fdcfa6611f963cab09eaf12eff22d1f241027c094bf54d046e4fa61c431551f1369e595097a005ba"

RPROVIDES:${PN} += "gtk2-engines \
gtk2-engines-lang"

RDEPENDS:${PN} += "gtk2-engine-clearlooks \
gtk2-engine-crux \
gtk2-engine-glide \
gtk2-engine-hcengine \
gtk2-engine-industrial \
gtk2-engine-mist \
gtk2-engine-redmond95 \
gtk2-engine-thinice \
gtk2-theme-clearlooks \
gtk2-theme-crux \
gtk2-theme-industrial \
gtk2-theme-mist \
gtk2-theme-redmond95 \
gtk2-theme-thinice"

inherit rpm
