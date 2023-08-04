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

PV = "13.3.0"

RPM_NAME = "teleport-13.3.0-1.1.aarch64.rpm"
RPM_HASH = "8d405ef6df1722b837f4422026eca9b161c70cf812808fa2b60a28c66016d07ea687183fc37f222b9af9acad01567019e983f8ced083d36405eff41a6f7068b6"

RPROVIDES:${PN} += "config-teleport \
teleport"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
teleport-tctl"

inherit rpm
