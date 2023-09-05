SUMMARY = "OpenConnect VPN Server"
DESCRIPTION = "OpenConnect server (ocserv) is an SSL VPN server. Its purpose is to \
be a secure, small, fast and configurable VPN server. It implements \
the OpenConnect SSL VPN protocol, and has also (currently experimental) \
compatibility with clients using the AnyConnect SSL VPN protocol. \
The OpenConnect protocol provides a dual TCP/UDP VPN channel, and \
uses the standard IETF security protocols to secure it. The server \
is implemented primarily for the GNU/Linux platform but its code \
is designed to be portable to other UNIX variants as well. \
 \
Ocserv's main features are security through privilege separation \
and sandboxing, accounting, and resilience due to a combined use \
of TCP and UDP. Authentication occurs in an isolated security \
module process, and each user is assigned an unprivileged worker \
process, and a networking (tun) device. That not only eases the \
control of the resources of each user or group of users, but also \
prevents data leak (e.g., heartbleed-style attacks), and privilege \
escalation due to any bug on the VPN handling (worker) process. \
A management interface allows for viewing and querying logged-in users."
LICENSE = "GPL-2.0-only"

PV = "1.2.1"

RPM_NAME = "ocserv-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "c2b151bdb1677fab3f52446ad4b429b9c1a0cd683bb2fd023a701da61a4b71bfea59749761fb64aa296b45148854209766f549c12e001642220ac418d62d4ee4"

RPROVIDES:${PN} += "config-ocserv \
ocserv"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gnutls \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libev.so.4 \
libfreeradius-client.so.2 \
libgnutls.so.30 \
liblz4.so.1 \
libmaxminddb.so.0 \
libnettle.so.8 \
libnl-3.so.200 \
libnl-route-3.so.200 \
liboath.so.0 \
libpam.so.0 \
libprotobuf-c.so.1 \
libreadline.so.8 \
libsystemd.so.0 \
libtalloc.so.2 \
systemd"

inherit rpm
