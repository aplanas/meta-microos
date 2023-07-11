SUMMARY = "Development files for LVM2"
DESCRIPTION = "This package provides development files for the LVM2 Logical Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-devel-2.03.16-7.1.aarch64.rpm"
RPM_HASH = "80bb22257fd3da715dd0e0e3920a923f344d2389ec3372d63fa3bdb60400815d82efab942bb166fe9ba76e650ec59b4dc6de3646a2350f62a77b7f535915a784"

RPROVIDES:${PN} += "lvm2-devel"

RDEPENDS:${PN} += "device-mapper-devel \
liblvm2cmd2-03 \
lvm2"

inherit rpm
