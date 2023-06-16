SUMMARY = "The Console Manager"
DESCRIPTION = "ConMan is a serial console management program designed to support a large \
number of console devices and simultaneous users.  It supports: \
  - local serial devices \
  - remote terminal servers (via the telnet protocol) \
  - IPMI Serial-Over-LAN (via FreeIPMI) \
  - Unix domain sockets \
  - external processes (eg, using Expect for telnet/ssh/ipmi-sol connections) \
 \
Its features include: \
  - logging (and optionally timestamping) console device output to file \
  - connecting to consoles in monitor (R/O) or interactive (R/W) mode \
  - allowing clients to share or steal console write privileges \
  - broadcasting client output to multiple consoles"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "conman-0.3.1-1.2.aarch64.rpm"
RPM_HASH = "c0ce45c162dfa8bc8f573f7f20c921aa7b031b3474ca74c03928ea827d7064938dd3ddf38c9f81917f764896f27ed029c143c7ce4a71867f81feedaa98614f41"

RPROVIDES:${PN} += "config-conman \
conman \
group-conman \
user-conman"

RDEPENDS:${PN} += "/usr/bin/expect \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
expect \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwrap.so.0 \
logrotate \
sed \
shadow \
systemd"

inherit rpm
