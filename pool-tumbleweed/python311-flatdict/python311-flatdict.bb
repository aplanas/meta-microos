SUMMARY = "Python module for interacting with nested dicts"
DESCRIPTION = "Python module for interacting with nested dicts as a single level dict with delimited keys."
LICENSE = "BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python311-flatdict-4.0.1-3.6.noarch.rpm"
RPM_HASH = "6d0a3b7e8ee635d5fb7f932bc92034efac18088a7fe84e8eb7944d8ff2513bccc1fffa71f132dab66581c68bf65e2af12ad487cf4d6304c88852ef69fb75ba2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flatdict) \
python311-flatdict \
python3dist(flatdict)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
