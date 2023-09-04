SUMMARY = "BPF Compiler Collection documentation"
DESCRIPTION = "Documentation on how to write programs with the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-docs-0.26.0-2.12.noarch.rpm"
RPM_HASH = "c5b182e865d82e5937863249dc9b1395fa861cd9e0850ac527c453719dc3228cc887dd0347e50a3b167a1a7dacb1bcdce67d4f0043b566a80d2f75234dc1f5e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcc-docs"

RDEPENDS:${PN} += ""

inherit rpm
