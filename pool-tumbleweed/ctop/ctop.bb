SUMMARY = "Top-like interface for container metrics"
DESCRIPTION = "Top-like interface for container metrics."
LICENSE = "MIT"

PV = "0.7.7"

RPM_NAME = "ctop-0.7.7-1.1.aarch64.rpm"
RPM_HASH = "e5fd86567e6cabf568af59a81ab47977c7a00414548b31eaf60de9f40f02499ba44dc81ea912f3ead472b3451f4f986d24d59f03b92876fab38ce5a8d2fc7e8e"

RPROVIDES:${PN} += "ctop"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
