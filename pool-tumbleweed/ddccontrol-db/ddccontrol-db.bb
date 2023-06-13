SUMMARY = "Monitor database for ddccontrol"
DESCRIPTION = "Database of well-known monitors and their DDC/CI controls \
used by ddccontrol."
LICENSE = "GPL-2.0-or-later"

PV = "20220903"

RPM_NAME = "ddccontrol-db-20220903-1.2.noarch.rpm"
RPM_HASH = "3696b1d292d0cf3c26c1f4ec895e5daa60bca5d1d4aac5238223da9f494ea040e841e64ae2f07fb3aa8bd0483d9998c472f035a5225244af37a25011e8103a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddccontrol-db"

RDEPENDS:${PN} += ""

inherit rpm
