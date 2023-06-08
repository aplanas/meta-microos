SUMMARY = "Helpers Data for exo"
DESCRIPTION = "This package provides the helpers data for exo."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.0"

RPM_NAME = "exo-data-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "95952fa7af9d9f628141f165abf93d608a2d42727e14ed9c06ccac853539b096747c48189ba909a400280eaed3be8b8b5ea172962625fa927ca137ad9012e4e7"

RPROVIDES:${PN} += "exo-data exo-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
