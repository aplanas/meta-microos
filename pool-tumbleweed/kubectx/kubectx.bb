SUMMARY = "Faster way to switch between clusters and namespaces in kubectl"
DESCRIPTION = "kubectx is a utility to manage and switch between kubectl(1) contexts."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "kubectx-0.9.5-1.1.noarch.rpm"
RPM_HASH = "442e69aa3902ed72978039bbf4f8cc9c5486b3bc13048648350d4a2707097f97f3f63ad1f9920bf5e8d44683c2b13ee4b0829c3cc20e299ade9e24056badc77e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectx"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
