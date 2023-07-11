SUMMARY = "Chewing Data for libchewing"
DESCRIPTION = "This package contains data files for chewing, an intelligent phonetic \
input method library for traditional Chinese."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1+git20200627.452f622"

RPM_NAME = "chewing-data-0.5.1+git20200627.452f622-1.10.aarch64.rpm"
RPM_HASH = "1ac535078305454f792beba15a3080e1566df7ccab0d133f79f64b2e5caaeb569b677187fa322423259917b9598b853e0e44ce8e17aae96d96fb44a7d1969127"

RPROVIDES:${PN} += "chewing-data"

RDEPENDS:${PN} += ""

inherit rpm
