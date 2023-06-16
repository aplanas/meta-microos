SUMMARY = "SELinux troubleshoot server"
DESCRIPTION = "Provides tools to help diagnose SELinux problems. When AVC messages \
are generated an alert can be generated that will give information \
about the problem and help track its resolution. Alerts can be configured \
to user preference. The same tools can be run on existing log files."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.30"

RPM_NAME = "setroubleshoot-server-3.3.30-2.2.aarch64.rpm"
RPM_HASH = "e90dbddda84cbc86bf0be38ba185c6136d73e88cb5eff31ea76b8fd6f9eda7e366810ab6e20e806457b7955eac563667d1c7bcc1b0321cb76a716bde1343633a"

RPROVIDES:${PN} += "config-setroubleshoot-server \
group-setroubleshoot \
python3.10dist-setroubleshoot \
python3dist-setroubleshoot \
setroubleshoot-server \
user-setroubleshoot"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
audit \
audit-libs-python3 \
dbus-1 \
ld-linux-aarch64.so.1 \
libauparse.so.0 \
libc.so.6 \
libcap-ng.so.0 \
libdbus-1.so.3 \
libselinux.so.1 \
policycoreutils-python-utils \
polkit \
python-abi \
python3-dasbus \
python3-dbus-python \
python3-gobject \
python3-libxml2 \
python3-rpm \
python3-selinux \
python3-systemd \
setroubleshoot-plugins"

inherit rpm
