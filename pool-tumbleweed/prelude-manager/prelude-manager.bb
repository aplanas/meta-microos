SUMMARY = "Bus communication for all Prelude modules"
DESCRIPTION = "Prelude Manager is a high availability server that \
accepts secured connections from distributed sensors \
and saves received events to a media specified by the user \
(database, log file, mail etc.). The server schedules and \
establishes the priorities of treatment according to the \
critical character and the source of the alerts."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "1b9b7906e464baba07a21a4e0ec023681bac3a8bb8ad083c54bc5740379cc02bc84221b58e393bed6978da7978800f13379fe90a93e4116b72ad501cfd5354f3"

RPROVIDES:${PN} += "config(prelude-manager) \
prelude-manager \
prelude-manager(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libmaxminddb.so.0()(64bit) \
libprelude.so.28()(64bit) \
libwrap.so.0()(64bit)"

inherit rpm
