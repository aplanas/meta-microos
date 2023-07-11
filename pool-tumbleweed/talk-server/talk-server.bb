SUMMARY = "Talk Daemon to Chat with Another User"
DESCRIPTION = "This package contains the talk daemon, which allows you to chat with \
another user on a different system. Talk is a communication program \
which copies lines from one terminal to the terminal of another user."
LICENSE = "BSD-3-Clause"

PV = "0.17"

RPM_NAME = "talk-server-0.17-721.14.aarch64.rpm"
RPM_HASH = "e610e6c590add710f83a320d9ef666425f19fa6995b216f3ae2de9bd853a2977f13db06b8de3fbbdb83de56d81e19c065b0e9a9f00f87fe01f5da2a7ed1b08a7"

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
