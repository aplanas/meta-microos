SUMMARY = "Patch the inner source of python functions at runtime"
DESCRIPTION = "Patch the inner source of python functions at runtime."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python39-patchy-2.6.0-1.5.noarch.rpm"
RPM_HASH = "9c8792b51a8ba547151f0e4eba079aa418de67eea8f07f14df954af85d3a4a0739dfde5eab946aed56409b7beba69de2e62b5aba868cddf6fc5838cacc81a815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-patchy \
python39-patchy \
python3dist-patchy"

RDEPENDS:${PN} += "python-abi \
python39-pkgutil-resolve-name"

inherit rpm
