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

PV = "13.2.1"

RPM_NAME = "teleport-13.2.1-1.1.aarch64.rpm"
RPM_HASH = "35ec29d251625858c21d27ee26301130831ee32ce062ee253bcf7b57ef3bf07d217a36cd7275afef777efb7df16d6bb6f397d58ce3798f3c7570499287a4e264"

RPROVIDES:${PN} += "config-teleport \
teleport"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
teleport-tctl"

inherit rpm
