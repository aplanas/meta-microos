SUMMARY = "YaST2 - Data files for Country settings"
DESCRIPTION = "Data files for yast2-country together with the most often used API \
functions (Language module)"
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-country-data-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "4227e1b6937ada05449ed429daff448ae23874e442d1632a8b7dd7986b506686955d6e2e58b2325d6e138125139b4802e956b813fdbf724d7696b322e31c0013"

RPROVIDES:${PN} += "yast2-country-data \
yast2-country-data(aarch-64)"

RDEPENDS:${PN} += "yast2-ruby-bindings"

inherit rpm
