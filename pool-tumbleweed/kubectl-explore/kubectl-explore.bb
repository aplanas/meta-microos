SUMMARY = "A better kubectl explain with the fuzzy finder"
DESCRIPTION = "This plugin fuzzy-finds the field explanation from supported API resources. It implements different explanations for particular API version."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "kubectl-explore-0.7.1-1.4.aarch64.rpm"
RPM_HASH = "d433c615a838c0050383d34f7bd116342556fae09e24f4b3c0a29fdb7503a261a4914920f659c7d0d932dd5f4537de9555544661010b19106125807fbe04fc9b"

RPROVIDES:${PN} += "kubectl-explore \
kubectl-explore(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
