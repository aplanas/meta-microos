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

RPM_NAME = "open-isns-0.102-1.4.aarch64.rpm"
RPM_HASH = "9ae295ac23e7ea4e362acff292ab72d35d5a84eedc1bf8063215131be203d0b3d8b7966683f63850c9bbe6234d46719a4e2b767be849bffb70fb7d9a45883041"

RPROVIDES:${PN} += "config-open-isns \
libisns.so.0 \
open-isns"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libslp.so.1 \
systemd"

inherit rpm
