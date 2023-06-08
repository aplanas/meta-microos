SUMMARY = "BPF Compiler Collection documentation"
DESCRIPTION = "Documentation on how to write programs with the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-docs-0.26.0-2.8.noarch.rpm"
RPM_HASH = "b9247d9dd9e817b757d9d645bf1a142c68c0d63e067a61c619e02e0fc740dd60fdc8a65dc9959797e0abdf574a36c7ef83d334a358a0306e84bee4c288356ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcc-docs"
RDEPENDS:${PN} += ""

inherit rpm
