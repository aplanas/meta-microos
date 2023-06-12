SUMMARY = "Python Promises"
DESCRIPTION = "Promises implementation for python."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python39-vine-5.0.0-2.3.noarch.rpm"
RPM_HASH = "2c71241bc0855cc8f373e71df94888f712f37738ed6a72124ba5eef1ad4899d47e51b761ebfef76468493cd8e8dce4b15501346779d873c6870734940c3dd033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vine) \
python39-vine \
python3dist(vine)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
