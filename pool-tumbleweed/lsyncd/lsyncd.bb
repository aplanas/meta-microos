SUMMARY = "Live Syncing (Mirror) Daemon"
DESCRIPTION = "Lsyncd (Live Syncing (Mirror) Daemon) uses rsync to synchronize local directories with a remote machine running rsyncd. It watches multiple directory trees through inotify. The first step after adding the watches is to rsync all directories with the remote host, and then the software synchronizes single files by collecting the inotify events. lsyncd is a lightweight live mirror solution that should be easy to install and use while blending well with your system."
LICENSE = "GPL-2.0-only"

PV = "2.2.3"

RPM_NAME = "lsyncd-2.2.3-3.8.aarch64.rpm"
RPM_HASH = "89ea23f3911e27b466a706bd8600cce9bfec35ec735197280fe4bb70723c86ae3db5eff449a9975176e48426dce1c99021e00a8f03864b52e19aad8884182a06"

RPROVIDES:${PN} += "config-lsyncd \
lsyncd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
logrotate \
rsync \
systemd"

inherit rpm
