SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.9.7"

RPM_NAME = "go1.9-doc-1.9.7-12.10.aarch64.rpm"
RPM_HASH = "2dc9cdc5f21b3394f855b61bb95e7187eefbd355c61bc8bb88cdc8cb3ebb019b6c002dfdeca57e647efe714065430a6d6f1e4ed315f989f7c80ecb3859e892cb"

RPROVIDES:${PN} += "go-doc \
go1.9-doc"

RDEPENDS:${PN} += "go1.9"

inherit rpm
