SUMMARY = "Live Syncing (Mirror) Daemon"
DESCRIPTION = "Lsyncd (Live Syncing (Mirror) Daemon) uses rsync to synchronize local directories with a remote machine running rsyncd. It watches multiple directory trees through inotify. The first step after adding the watches is to rsync all directories with the remote host, and then the software synchronizes single files by collecting the inotify events. lsyncd is a lightweight live mirror solution that should be easy to install and use while blending well with your system."
LICENSE = "GPL-2.0-only"

PV = "2.2.3"

RPM_NAME = "lsyncd-2.2.3-3.7.aarch64.rpm"
RPM_HASH = "927ea2259de9ce7a990175b2157d1baabb49875c98f2e8c83a4b06b42020750bc7071891ce7610e9c7e15dacc9126cc471ddc62ef623fca903d3fbb9f450867e"

RPROVIDES:${PN} += "config(lsyncd) \
lsyncd \
lsyncd(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblua5.4.so.5()(64bit) \
logrotate \
rsync \
systemd"

inherit rpm
