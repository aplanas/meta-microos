SUMMARY = "GTK+ 2 Theme Engines"
DESCRIPTION = "This package installs the theme engine libraries for GTK+ 2."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engines-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "25c896373fb7c17f70809cf9532593ca260d20c65c25f6aa05fad11e94f226ac206e91ec8d0dfef96c74526bcd1dc37ab3ecd6d7f144727404b0bc5420d77d05"

RPROVIDES:${PN} += "gtk2-engines \
gtk2-engines(aarch-64) \
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
