SUMMARY = "Replaces plymouth by blogd"
DESCRIPTION = "The Blogd daemon can be used as a replacement for Plymouth in situations where \
a splash screen and/or usage of a frame buffer is unwanted.  The Blogd is also \
a Plymouth agent. That means, it can handle requests for a password prompt by \
the system password service of systemd. \
The blogd daemon writes out boot log messages to every terminal device used by \
/dev/console and to the log file /var/log/boot.log.  When halting or rebooting \
the system, it moves the log file to /var/log/boot.old and appends all log \
messages upto to point at which the file systems becomes unavailable."
LICENSE = "GPL-2.0-or-later"

PV = "2.26"

RPM_NAME = "blog-plymouth-2.26-2.2.aarch64.rpm"
RPM_HASH = "bcf5bbc538482d0b65443f0225611717f6e11a8c107ee26beebb784383ee960eddb9eb722ec38ae2a9dc69ee85107e9ef56da23c3971119b8f299b0611635174"

RPROVIDES:${PN} += "blog-plymouth blog-plymouth(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh blog systemd"

inherit rpm
