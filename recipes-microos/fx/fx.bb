SUMMARY = "Terminal JSON viewer"
DESCRIPTION = "Terminal JSON viewer."
LICENSE = "MIT"

PV = "24.1.0"

RPM_NAME = "fx-24.1.0-1.1.aarch64.rpm"
RPM_HASH = "64d19cde6cdc939ac65dec357f9523a9b18fab0094adbd3b8190a17d93b4f9b1473267f0facbcdfa4143cefdbef08ab4e6970420a66001265f7a8d471e729825"

RPROVIDES:${PN} += "fx fx(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
