SUMMARY = "A notifier for systems using transactional updates"
DESCRIPTION = "Add notifications, via Desktop Bus (D-Bus), about transactional updates for \
all users currently logged in in a graphical session. Being even possible \
for it to be used as a reboot method through transactional-updates.conf(5)."
LICENSE = "GPL-3.0-only"

PV = "1.1.0.2"

RPM_NAME = "transactional-update-notifier-1.1.0.2-1.5.aarch64.rpm"
RPM_HASH = "4a728e049a3857236771df780ef5d89f8bc724e35c40e126752db5870acd8b62e043b3a6f2d35ad269c57e3e42598b7c0e5bbde7be4b73ddb9a794650d7236ed"

RPROVIDES:${PN} += "transactional-update-notifier"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1"

inherit rpm
