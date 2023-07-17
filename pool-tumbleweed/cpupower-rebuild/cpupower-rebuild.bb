SUMMARY = "Empty package to ensure rebuilding cpupower in OBS"
DESCRIPTION = "This is empty package that ensures cpupower is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "cpupower-rebuild-6.4.2-4.16.aarch64.rpm"
RPM_HASH = "b9f3ec2ec5e523cfc658f104064386d6e336718fdde1b4dbc31da7481e6e30b8e0e51ef23160ca34256e638e4d109c5c263d2c46ce0924f307b7285bd947c9a9"

RPROVIDES:${PN} += "cpupower-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
