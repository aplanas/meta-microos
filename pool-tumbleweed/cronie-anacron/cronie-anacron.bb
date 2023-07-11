SUMMARY = "Utility for running regular jobs"
DESCRIPTION = "Anacron becames part of cronie. Anacron is used only for running regular jobs. \
The default settings execute regular jobs by anacron, however this could be \
overloaded in settings."
LICENSE = "BSD-3-Clause & GPL-2.0-only & MIT"

PV = "1.6.1"

RPM_NAME = "cronie-anacron-1.6.1-91.4.aarch64.rpm"
RPM_HASH = "69f7af711b967da14db384ad72b153e2e322e2d649f16c4c6eea7f3577b867ec43e8e82f2591cccfc2634158cd9cdbd0073f9b273a242d6a6893498ef45723f6"

RPROVIDES:${PN} += "config-cronie-anacron \
cronie-anacron"

RDEPENDS:${PN} += "/usr/bin/sh \
cronie \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
