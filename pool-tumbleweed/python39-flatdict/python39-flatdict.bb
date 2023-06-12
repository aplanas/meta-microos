SUMMARY = "Python module for interacting with nested dicts"
DESCRIPTION = "Python module for interacting with nested dicts as a single level dict with delimited keys."
LICENSE = "BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python39-flatdict-4.0.1-3.6.noarch.rpm"
RPM_HASH = "95cc5c01ba0bd3cabb8bdb530ff82556c9744d6441eec4b30f6de65741ce1e3f49fc3e432c029f26ea1caf9dfdb7fd3e8fcf80b933ad388c7e85073a1d6cca97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flatdict) \
python39-flatdict \
python3dist(flatdict)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
