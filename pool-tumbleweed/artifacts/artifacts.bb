SUMMARY = "Digital Forensics Artifact Repository"
DESCRIPTION = "A community-sourced, machine-readable knowledge base of forensic \
artifacts that can be used both as an information source and within \
other tools. \
 \
Using artifacts in tools just requires reading YAML. (The Python code \
in the project is merely used to validate that the artifacts follow \
the specification.) \
 \
For some background on the artifacts system and how its developers \
expect it to be used, see the BlackHat presentation and Youtube video \
from the GRR team."
LICENSE = "Apache-2.0"

PV = "20220429"

RPM_NAME = "artifacts-20220429-3.1.noarch.rpm"
RPM_HASH = "3d6ee01d1ef829e084ab02a5fe6d73537c265f78ceda08eadacbfd604653ed0a0dd3038ac47f1137a6fffb780a8b37a3feb5efee81b76369cebec7c325adcd03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artifacts"

RDEPENDS:${PN} += ""

inherit rpm
