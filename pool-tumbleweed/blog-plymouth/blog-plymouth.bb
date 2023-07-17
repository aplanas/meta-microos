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

PV = "2.27"

RPM_NAME = "blog-plymouth-2.27-1.1.aarch64.rpm"
RPM_HASH = "71bbae9b6065a5288b046ed8f2123c571080549be4ded4e140d5dd12b59a203813f780047608efd3f207ff87b36b9f0c850d5acf07ec95507eeafcfce4c20895"

RPROVIDES:${PN} += "blog-plymouth"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
blog \
systemd"

inherit rpm
