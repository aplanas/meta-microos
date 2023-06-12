SUMMARY = "Send a mail if a systemd.timer fails and/or succeeds"
DESCRIPTION = "systemd-mail-status is called by systemd-status-mail@.service if the \
service is configured for the OnFailure and/or OnSuccess case of a \
systemd unit. It sends an email to a configureable address with the name \
of the service, the hostname and the output of \
'systemctl status --full <service>'."
LICENSE = "GPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "systemd-status-mail-1.11-2.1.noarch.rpm"
RPM_HASH = "620c7cd1d3fb0ba26132b2ba95727497abf8bef770d5de709c0d184d90c28200c0daaf20f0a90812b264ea675148c238a34c223e3a5ff481831fcf1ad74981cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-status-mail"
RDEPENDS:${PN} += "(/usr/sbin/sendmail or mailx) \
/bin/sh"

inherit rpm
