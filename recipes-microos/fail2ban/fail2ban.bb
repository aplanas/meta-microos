SUMMARY = "Bans IP addresses that make too many authentication failures"
DESCRIPTION = "Fail2ban scans log files like /var/log/messages and bans IP \
addresses that makes too many password failures. It updates firewall rules to \
reject the IP address, can send e-mails, or set host.deny entries.  These rules \
can be defined by the user. Fail2Ban can read multiple log files such as sshd \
or Apache web server ones."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "fail2ban-1.0.2-1.2.noarch.rpm"
RPM_HASH = "4ffc8d5c3d2962fa622ef45b28ba9d2e56731e336a9ff838e709555ed613e78b7a2c1bcbd04f8ae32e91869a78fe964b8230de5cac8c72fd0d35b10ff0db0006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(fail2ban) fail2ban python3.10dist(fail2ban) python3dist(fail2ban)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 cron ed iptables logrotate python(abi) python3 python3-pyinotify python3-systemd systemd whois"

inherit rpm
