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

PV = "13.2.2"

RPM_NAME = "teleport-13.2.2-1.1.aarch64.rpm"
RPM_HASH = "527df01d6053e754f1e20fc1d98a30441cb92988d0abb6017d2cec8863009b89330644d6f7d77de18699486c41948523a34bfe0f75373ac9c36a1cb185dd79c7"

RPROVIDES:${PN} += "config-teleport \
teleport"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
teleport-tctl"

inherit rpm
