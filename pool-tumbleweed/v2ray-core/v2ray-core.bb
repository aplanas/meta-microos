SUMMARY = "Network tools for building a computer network"
DESCRIPTION = "Project V is a set of network tools for building a computer network. \
It secures network connections and protects privacy."
LICENSE = "MIT"

PV = "5.2.0"

RPM_NAME = "v2ray-core-5.2.0-2.3.aarch64.rpm"
RPM_HASH = "aa92829f82164e5d6dd33f1453f631eb5b20fd210973cd123ca52cdaf0fddc5c477e3ea73f21df0c73790a34590b123c510a981a4daecf32f89e3820d02cd1c9"

RPROVIDES:${PN} += "v2ray \
v2ray-core"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
