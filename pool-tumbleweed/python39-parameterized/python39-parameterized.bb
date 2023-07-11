SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "python39-parameterized-0.9.0-1.3.noarch.rpm"
RPM_HASH = "34ac529feb0469261dd2ae6c3a2703b017540d9aae97ad1260f80bfea0374413f767a4e03f9b50f64bb7afa55d28fc2383f4bd52f46471013177c7da574a6824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parameterized \
python39-parameterized \
python3dist-parameterized"

RDEPENDS:${PN} += "python-abi"

inherit rpm
