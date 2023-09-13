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

RPM_NAME = "open-isns-0.102-2.1.aarch64.rpm"
RPM_HASH = "18a63f4c4337b5f14c774d0107469a83fa45225617dfade54abc57df82db83b509e66ca36ce5bee3c8b4c4ff30a7585248608c0d5e692ea5502e20c1b3e74d6e"

RPROVIDES:${PN} += "config-open-isns \
libisns.so.0 \
open-isns"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
systemd"

inherit rpm
