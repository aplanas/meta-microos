SUMMARY = "A small collection of test tool plugins"
DESCRIPTION = "A small collection of test tool plugins"
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python39-flufl.testing-0.8-2.1.noarch.rpm"
RPM_HASH = "a1bb769b3731ff2aeefd3ced5957500729b0efc772d17f74858fdfd75c4e6a1a2c25f873ea295318c1fbd766143873bed7e025fc754eb111995b7733d983ea31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flufl.testing \
python39-flufl.testing \
python3dist-flufl.testing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
