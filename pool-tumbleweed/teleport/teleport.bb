SUMMARY = "Identity-aware, multi-protocol access proxy"
DESCRIPTION = "Teleport is the easiest, most secure way to access all your infrastructure. Teleport is an identity-aware, multi-protocol access proxy which understands SSH, HTTPS, RDP, Kubernetes API, MySQL, MongoDB and PostgreSQL wire protocols. \
 \
On the server-side, Teleport is a single binary which enables convenient secure access to behind-NAT resources such as: \
* SSH nodes - SSH works in browsers too! \
* Kubernetes clusters \
* PostgreSQL, MongoDB, CockroachDB and MySQL databases \
* Internal Web apps \
* Windows Hosts \
* Networked servers"
LICENSE = "Apache-2.0"

PV = "13.2.5"

RPM_NAME = "teleport-13.2.5-1.1.aarch64.rpm"
RPM_HASH = "38ee4416806896be37933981d88bf69c7e0253b854587be5a3dcf6182312eedd229e4a4c0d793859d49a12fca622f852559fbb529cf1af7770bdbb819206dfdb"

RPROVIDES:${PN} += "config-teleport \
teleport"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
teleport-tctl"

inherit rpm
