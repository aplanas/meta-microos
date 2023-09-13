SUMMARY = "Fish Completion for kyverno"
DESCRIPTION = "Fish command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.3"

RPM_NAME = "kyverno-fish-completion-1.10.3-1.1.noarch.rpm"
RPM_HASH = "118c8fe87cac8064df7bc0cc7cf0c0569a17240c24542c7a623df5caeae9846b89c6301172839573eb1100c73288b30b5ed8cda765cc2d0cf34046cd0f816b2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-fish-completion"

RDEPENDS:${PN} += "kyverno"

inherit rpm
