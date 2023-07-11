SUMMARY = "Additional mobile libraries"
DESCRIPTION = "Project V is a set of network tools for building a computer network. \
It secures network connections and protects privacy. \
 \
This package provide source code for v2ray-core"
LICENSE = "MIT"

PV = "5.7.0"

RPM_NAME = "golang-github-v2fly-v2ray-core-5.7.0-2.1.noarch.rpm"
RPM_HASH = "0768a746ff3e521c4f3e4112c93d8ff2f927dd5c75cb957eddab14ea9f65d40d9572c8fa19c908f877dbbdd2bd61eb8d9301313f41d52af26cc7add1f55ab20a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-v2fly-v2ray-core"

RDEPENDS:${PN} += ""

inherit rpm
