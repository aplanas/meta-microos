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

PV = "13.3.1"

RPM_NAME = "teleport-13.3.1-1.1.aarch64.rpm"
RPM_HASH = "4db4b2af5e7e01d519f43fbde1f5190141217eff67e76173d7c998b6987857d97e12edb2d6bed87244cb32bc1183a1b875e6668938a0747b18e4ed5ffc58e700"

RPROVIDES:${PN} += "config-teleport \
teleport"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
teleport-tctl"

inherit rpm
