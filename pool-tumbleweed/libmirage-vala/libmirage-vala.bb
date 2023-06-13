SUMMARY = "Vala bindings to libmirage"
DESCRIPTION = "libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package contains the Vala bindings to libmirage"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "libmirage-vala-3.2.6-1.8.noarch.rpm"
RPM_HASH = "a3ff507cecfcd6cbb63744eead0ecb81fa38214395a0e44c1cc643682750bc906e48471018fe0644d80bcdc1b81e26c58d1732848ef1a9bbffefaf76adaccdc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmirage-vala"

RDEPENDS:${PN} += ""

inherit rpm
