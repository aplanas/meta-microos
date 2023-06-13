SUMMARY = "Tool to find roles and cluster roles in a Kubernetes cluster"
DESCRIPTION = "RBAC Lookup is a CLI that allows you to easily find Kubernetes roles and cluster roles bound to any user, service account, or group name. \
Binaries are generated with goreleaser for each release for simple installation."
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "rbac-lookup-0.9.1-1.4.aarch64.rpm"
RPM_HASH = "21260c56c5a4ec08dedccada4aa3a80d899bd8fcddf9229708bea161ab32acb2fbc5776b2166cda7fc707761c4ddb29c8f1a47914d497bf1045f9041b620fb0a"

RPROVIDES:${PN} += "rbac-lookup \
rbac-lookup(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
