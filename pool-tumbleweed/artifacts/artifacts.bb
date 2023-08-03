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

PV = "20221219"

RPM_NAME = "artifacts-20221219-2.1.noarch.rpm"
RPM_HASH = "c290535c2aab7c36352c44133a246c2cc87e616c5e888e818beab584cfc47e7ae8a9ed7f11c94417f76cc048a33b05209d56937e9dd5f3aee8b3da3546abc769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artifacts"

RDEPENDS:${PN} += ""

inherit rpm
