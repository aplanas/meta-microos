SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-report-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "7702adc6d1455a73376d73a61dc04281a893c6e25e0ce18a5649ae75695bba586ef63cd770d6bd016152afddf0a61c8c7223f15ccc33c4f64d26548badc94af3"

RPROVIDES:${PN} += "libgda-report"

RDEPENDS:${PN} += "/usr/bin/python3 \
libgda-report-6-0-6-0-0"

inherit rpm
