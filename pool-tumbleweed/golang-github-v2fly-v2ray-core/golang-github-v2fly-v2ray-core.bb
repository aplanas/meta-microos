SUMMARY = "Additional mobile libraries"
DESCRIPTION = "Project V is a set of network tools for building a computer network. \
It secures network connections and protects privacy. \
 \
This package provide source code for v2ray-core"
LICENSE = "MIT"

PV = "5.2.0"

RPM_NAME = "golang-github-v2fly-v2ray-core-5.2.0-2.3.noarch.rpm"
RPM_HASH = "cc4aad0a9007824884604f87c7fbe2a92bf77f8f7c308ad8e7f8aa325e37d6c53158456466bfb1f8672137579fc3cda95c2534ff23b3a5a04b4cc3025b89829b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-v2fly-v2ray-core"

RDEPENDS:${PN} += ""

inherit rpm
