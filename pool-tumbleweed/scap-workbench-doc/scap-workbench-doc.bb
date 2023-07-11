SUMMARY = "Documentation for scap-workbench"
DESCRIPTION = "This package provides HTML documentation for scap-workbench."
LICENSE = "GPL-3.0-only"

PV = "1.2.1+git20221219.10c1929"

RPM_NAME = "scap-workbench-doc-1.2.1+git20221219.10c1929-1.2.aarch64.rpm"
RPM_HASH = "383029736619b82e34817ecd71956d0a66fef66f8b9a33df590de10cd6e6530a06d8fd3ed95f5cc6e9e7d628fd967a7ecd8e43df17865e06afe1df150569df16"

RPROVIDES:${PN} += "scap-workbench-doc"

RDEPENDS:${PN} += ""

inherit rpm
