SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.15.15"

RPM_NAME = "go1.15-doc-1.15.15-1.13.aarch64.rpm"
RPM_HASH = "902397d1f1bb322cb92d52529a5c2b1811920b5077fc6fbcc9997d9d4dd1bfe9af9d42e832512af277a4ce39e22847f5818ceebb2bc99a2e2b6d7fa44a7c6276"

RPROVIDES:${PN} += "go-doc \
go1.15-doc"

RDEPENDS:${PN} += "go1.15"

inherit rpm
