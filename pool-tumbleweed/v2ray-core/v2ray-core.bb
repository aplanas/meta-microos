SUMMARY = "Network tools for building a computer network"
DESCRIPTION = "Project V is a set of network tools for building a computer network. \
It secures network connections and protects privacy."
LICENSE = "MIT"

PV = "5.7.0"

RPM_NAME = "v2ray-core-5.7.0-2.1.aarch64.rpm"
RPM_HASH = "6cbd5e1a422ab58fdf7d9d49b31ae1659157e133565a2973f788b2361eda2e3ee0148fd95b1bea630a84e636112c5d783b217755db1d800b041c3d5820e6808b"

RPROVIDES:${PN} += "v2ray \
v2ray-core"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
