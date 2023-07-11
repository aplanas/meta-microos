SUMMARY = "A better kubectl explain with the fuzzy finder"
DESCRIPTION = "This plugin fuzzy-finds the field explanation from supported API resources. It implements different explanations for particular API version."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "kubectl-explore-0.7.1-1.5.aarch64.rpm"
RPM_HASH = "7896c8f7e4c88e60f2daaf37f484369f1c907c90aa93a2fceec50d50312c77a65147110277529533efa2ea6c373e4dfe1067097ee75dbd1c320cee5342ebf908"

RPROVIDES:${PN} += "kubectl-explore"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
