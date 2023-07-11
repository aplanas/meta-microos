SUMMARY = "Udev rules for GUDE DCF77 receivers"
DESCRIPTION = "Udev rules for GUDE DCF77 receivers. \
 \
* creates the symlink for /dev/refclock-0 to the TTY your DCF receiver \
  is connected to. \
* set group permission to 'ntp' for your DCF receiver's TTY to give \
  ntpd access to your device. \
 \
Supported devices \
 * GUDE Expert mouseCLOCK USB II \
 \
NOTE: You still have to manually adjust ntpd's AppArmor profile to give ntpd \
access to your DCF receiver's serial port (/etc/apparmor.d/tunables/ntpd)"
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "gude-mouseclock-udev-0.1-1.8.noarch.rpm"
RPM_HASH = "a48dab164842b41a876ba91719904269b3040fcb027fa9b192afb9de98354e29a3a18e60118fe9b0430754ae4a06a15cc7d0772a8808e14d4fa74e98444acb3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gude-mouseclock-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd \
user-ntp"

inherit rpm
