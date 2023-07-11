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

RPM_NAME = "blog-plymouth-2.26-2.3.aarch64.rpm"
RPM_HASH = "2c36cd7aec2a8b73c9cb03abbd708844363b3823d050d1a3319233e9b661325ddbf0a45ad9a84e59cb7343c12cfa2a0a0e8cd1ef54eb0a69606b9ae88ef6bec4"

RPROVIDES:${PN} += "blog-plymouth"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
blog \
systemd"

inherit rpm
