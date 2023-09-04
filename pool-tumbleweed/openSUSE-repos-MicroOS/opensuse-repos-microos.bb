SUMMARY = "openSUSE package repositories"
DESCRIPTION = "Definitions for openSUSE repository management via zypp-services"
LICENSE = "MIT"

PV = "20230810.a7534f6"

RPM_NAME = "openSUSE-repos-MicroOS-20230810.a7534f6-1.1.aarch64.rpm"
RPM_HASH = "68b5ac474f01daa306d4b1910d68ee347ff4993ec872a051d2b27608768407bd334abbd61e613048bec02a2128054e96e3662372efa25749582ddef6b7259560"

RPROVIDES:${PN} += "openSUSE-repos \
openSUSE-repos-MicroOS"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper"

inherit rpm
