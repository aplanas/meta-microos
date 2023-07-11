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

RPM_NAME = "artifacts-20220429-3.2.noarch.rpm"
RPM_HASH = "b6ae5fa772c3c21bae0e9429671f74aa917072b11b64528fe0d093b4ac7c3c8e1e250283d11e63f378e4b51c79850cddd0d33c435ab0faecfda6a78fa4c40d12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artifacts"

RDEPENDS:${PN} += ""

inherit rpm
