SUMMARY = "Security-Check Scripts"
DESCRIPTION = "Regularly executable scripts (via systemd timers) for checking the security of \
your system. The seccheck systemd timers have to be enabled (and possibly started) \
by the administrator for the checks to be run."
LICENSE = "GPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "seccheck-3.0-18.8.noarch.rpm"
RPM_HASH = "0c9c020a64cb354e2ed54b744447504d62afc5890998f570db540e382df8f01c316c8294ed52d527c915910b608ec2af2e77625ac4738fd86ef7b8c66b37c6ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(seccheck) \
seccheck \
suse-security-check-3.0"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
bash \
fillup \
systemd"

inherit rpm
