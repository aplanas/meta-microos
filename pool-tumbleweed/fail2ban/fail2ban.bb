SUMMARY = "Bans IP addresses that make too many authentication failures"
DESCRIPTION = "Fail2ban scans log files like /var/log/messages and bans IP \
addresses that makes too many password failures. It updates firewall rules to \
reject the IP address, can send e-mails, or set host.deny entries.  These rules \
can be defined by the user. Fail2Ban can read multiple log files such as sshd \
or Apache web server ones."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "fail2ban-1.0.2-2.2.noarch.rpm"
RPM_HASH = "2f9ac65ba91e1b1b0465d57aec49870ee6f0764874848d1835d20fb02f15c21c64da987f019f7877efb8406430b53798b3dc925afa589ac9f7ae711d36803f28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fail2ban \
fail2ban \
python3.11dist-fail2ban \
python3dist-fail2ban"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
cron \
ed \
iptables \
logrotate \
python-abi \
python3 \
python3-pyinotify \
python3-systemd \
systemd \
whois"

inherit rpm
