SUMMARY = "SELinux troubleshoot server"
DESCRIPTION = "Provides tools to help diagnose SELinux problems. When AVC messages \
are generated an alert can be generated that will give information \
about the problem and help track its resolution. Alerts can be configured \
to user preference. The same tools can be run on existing log files."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.31"

RPM_NAME = "setroubleshoot-server-3.3.31-1.1.aarch64.rpm"
RPM_HASH = "1e6d5a2d3c6582af650bf2405ab63bff738a675253ea87401aa5a9b8f5aba621d8fb0851607ce055fbe885a64025fb67ee94555a589a6d13e617aff65aec004e"

RPROVIDES:${PN} += "config-setroubleshoot-server \
group-setroubleshoot \
python3.11dist-setroubleshoot \
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
