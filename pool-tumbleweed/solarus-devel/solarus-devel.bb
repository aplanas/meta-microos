SUMMARY = "Development files for solarus"
DESCRIPTION = "Development files for Solarus, including header files."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-devel-1.6.5-2.16.aarch64.rpm"
RPM_HASH = "11309631d47fe2f55e8a5872a8b9e9857359183817d98d523e0f310bd5ec236e923ef4e099033e30d7b8b0ec64e9456d9ac78fb2859ffbb2bb0f8e19cf8967cc"

RPROVIDES:${PN} += "solarus-devel"

RDEPENDS:${PN} += "solarus \
solarus-gui"

inherit rpm
