SUMMARY = "Data files for Taisei"
DESCRIPTION = "Data files for Taisei, an open clone of the Touhou Project series. Touhou is a \
one-man project of shoot ’em up games set in an isolated world full of \
Japanese folklore."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "taisei-data-1.4-1.1.noarch.rpm"
RPM_HASH = "4eca6a41bcfb7eff5b85dd950aa3d827033432afd9001d42bf0c0e5cc09adc5e5917a772d707a22f299420e80e91898f45a1f579651856038422f1a5f68a29a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "taisei-data"

RDEPENDS:${PN} += "taisei"

inherit rpm
