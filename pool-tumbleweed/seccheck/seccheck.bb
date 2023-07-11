SUMMARY = "Security-Check Scripts"
DESCRIPTION = "Regularly executable scripts (via systemd timers) for checking the security of \
your system. The seccheck systemd timers have to be enabled (and possibly started) \
by the administrator for the checks to be run."
LICENSE = "GPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "seccheck-3.0-18.9.noarch.rpm"
RPM_HASH = "84b23a4c93b88472a2c1e379a1275099ac330b2f5e93f13547493d64d00ee69c1fe0c75883ebb3baef0577cbb07308c9b6def5519b6c41094a98e310be47dbcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-seccheck \
seccheck \
suse-security-check-3.0"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
bash \
fillup \
systemd"

inherit rpm
