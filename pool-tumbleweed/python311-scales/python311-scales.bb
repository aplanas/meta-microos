SUMMARY = "Stats for Python processes"
DESCRIPTION = "Statistic generator for python processes"
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python311-scales-1.0.9-3.12.noarch.rpm"
RPM_HASH = "0e8bf20aa09674d6da18a1e85ec657092d8c469a9ee0d17d921912bc9dddc8e8ad42bd511dfa92bcec43d0d258a904bd683fe90c93c8ae34add854a74931b6c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(scales) \
python311-scales \
python3dist(scales)"

RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
