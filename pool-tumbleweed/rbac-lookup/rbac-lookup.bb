SUMMARY = "Tool to find roles and cluster roles in a Kubernetes cluster"
DESCRIPTION = "RBAC Lookup is a CLI that allows you to easily find Kubernetes roles and cluster roles bound to any user, service account, or group name. \
Binaries are generated with goreleaser for each release for simple installation."
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "rbac-lookup-0.9.1-1.5.aarch64.rpm"
RPM_HASH = "26ab031ff9d763ef71ca081ebc881d70b424032125f2070612821e89192b27dfe4e004259b45452fb1f7387220a77a0b45ea090f9e3f2707506f883d26c57839"

RPROVIDES:${PN} += "rbac-lookup"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
