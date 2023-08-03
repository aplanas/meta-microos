SUMMARY = "Fish Completion for kyverno"
DESCRIPTION = "Fish command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.2"

RPM_NAME = "kyverno-fish-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "086d2f57e2d598ee13e63584b287c4302a29322cd4b3a8baa1478bb85f10ace28275ceea67e5c51d58f800f0fc22a0354a47aa0d7764995a2c9bd729ef582bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-fish-completion"

RDEPENDS:${PN} += "kyverno"

inherit rpm
