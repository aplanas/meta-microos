SUMMARY = "A notifier for systems using transactional updates"
DESCRIPTION = "Add notifications, via Desktop Bus (D-Bus), about transactional updates for \
all users currently logged in in a graphical session. Being even possible \
for it to be used as a reboot method through transactional-updates.conf(5)."
LICENSE = "GPL-3.0-only"

PV = "1.1.0.2"

RPM_NAME = "transactional-update-notifier-1.1.0.2-1.4.aarch64.rpm"
RPM_HASH = "b7e8a3b4f4de2597ae3e01e02fe99759748f9c01ff2337c00ca3d9e00bab856d4cb7be3e7da588ce45c1aa48bd35fe05cb9ccd6717b86264f05cd9c654cf4ce9"

RPROVIDES:${PN} += "transactional-update-notifier"

RDEPENDS:${PN} += "/bin/sh \
dbus-1"

inherit rpm
