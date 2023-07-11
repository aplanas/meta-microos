SUMMARY = "United States datum grids for Proj"
DESCRIPTION = "United States datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-us-9.2.1-1.1.noarch.rpm"
RPM_HASH = "fc8a0c0c7c7b1fe9f7fac8167d8f6adc16da8de95ed695c1fb3d4fecf941491bde9ae5f4b26dc3f1fff1830ffc895edca7576c9f33e2e61caa88588c3425bfc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-us"

RDEPENDS:${PN} += ""

inherit rpm
