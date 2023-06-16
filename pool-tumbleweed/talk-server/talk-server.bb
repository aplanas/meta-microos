SUMMARY = "Talk Daemon to Chat with Another User"
DESCRIPTION = "This package contains the talk daemon, which allows you to chat with \
another user on a different system. Talk is a communication program \
which copies lines from one terminal to the terminal of another user."
LICENSE = "BSD-3-Clause"

PV = "0.17"

RPM_NAME = "talk-server-0.17-721.13.aarch64.rpm"
RPM_HASH = "e4fdb133add0c378f41112a84a40f29d1682dc88fadbb3def77bb99aa1da6107a7bd7b053d718fbd35f6635ccd6c3a3aeb673810db119ae451342b259ace0a61"

RPROVIDES:${PN} += "nkitserv-/usr/sbin/in.talkd \
talk-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss-usrfiles2 \
net-tools \
netcfg \
systemd"

inherit rpm
