SUMMARY = "Hamcrest framework for matcher objects"
DESCRIPTION = "Hamcrest framework for matcher objects. \
PyHamcrest is a framework for writing matcher objects, \
allowing you to declaratively define “match” rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-PyHamcrest-2.0.3-2.3.noarch.rpm"
RPM_HASH = "89c2cc261be8e060a8cfa9ba5be8ef52b3eb3d595fd6c6e92b5e7afb45fd9fb5451dae255b548eae4e11a49caab2e4ee18d19625e75e7c788f3fb11bdbc194f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyhamcrest \
python39-PyHamcrest \
python39-hamcrest \
python3dist-pyhamcrest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
