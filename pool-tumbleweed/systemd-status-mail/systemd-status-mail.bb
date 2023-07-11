SUMMARY = "Send a mail if a systemd.timer fails and/or succeeds"
DESCRIPTION = "systemd-mail-status is called by systemd-status-mail@.service if the \
service is configured for the OnFailure and/or OnSuccess case of a \
systemd unit. It sends an email to a configureable address with the name \
of the service, the hostname and the output of \
'systemctl status --full <service>'."
LICENSE = "GPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "systemd-status-mail-1.11-2.2.noarch.rpm"
RPM_HASH = "e150f994599683f7149165ac431cfbb4cf06707399102bdee2ddbf8b2b59c7451b8904f4e77024eccf06d716b2244ec01fabcf1fab5c48415ec40417b9a58649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-status-mail"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
