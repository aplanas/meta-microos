SUMMARY = "Partial Implementation of iSNS iSCSI registration"
DESCRIPTION = "This is a partial implementation of the iSNS protocol (see below), \
which supplies directory services for iSCSI initiators and targets. \
 \
The iSNS protocol is specified in \
[RFC 4171](http://tools.ietf.org/html/rfc4171) and its purpose is to \
make easier to discover, manage, and configure iSCSI devices. With \
iSNS, iSCSI targets can be registered to a central iSNS server and \
initiators can be configured to discover the targets by asking the \
iSNS server."
LICENSE = "LGPL-2.1-or-later"

PV = "0.102"

RPM_NAME = "open-isns-0.102-1.5.aarch64.rpm"
RPM_HASH = "39b328b93629e82413d1f84f5a5c56274f6edaab08692efb9c0b5388eb7851ff88c431df6bebd84b9ab49f351e0319086b0d05f7082039e190c98946abb920d2"

RPROVIDES:${PN} += "config-open-isns \
libisns.so.0 \
open-isns"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libslp.so.1 \
systemd"

inherit rpm
