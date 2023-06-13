SUMMARY = "hammett is a fast python test runner"
DESCRIPTION = "hammett is a fast python test runner"
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-hammett-0.5.0-1.17.noarch.rpm"
RPM_HASH = "508ecfc7f8b12a8b4cac8203036c93944939ea6234675e148f692a879d9438e68a0bcacbca8777aeca8dade7c25d9b1f285d4309cf58c03775869eb4b98eb0b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hammett) \
python39-hammett \
python3dist(hammett)"

RDEPENDS:${PN} += "python(abi) \
python39-astunparse \
python39-colorama"

inherit rpm
