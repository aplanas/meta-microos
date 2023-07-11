SUMMARY = "Python module for interacting with nested dicts"
DESCRIPTION = "Python module for interacting with nested dicts as a single level dict with delimited keys."
LICENSE = "BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python39-flatdict-4.0.1-3.8.noarch.rpm"
RPM_HASH = "e490500269f56196092bde9aa060840835ef1d26c1e0446c83a086feb5a16192d8d7fa597fab52780669841f88131dfe4c1c226eef73dfb8d467bdf238def81a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flatdict \
python39-flatdict \
python3dist-flatdict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
