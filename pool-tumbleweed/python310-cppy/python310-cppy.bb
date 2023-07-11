SUMMARY = "C++ headers for C extension development"
DESCRIPTION = "C++ headers for C extension development"
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-cppy-1.2.1-2.3.noarch.rpm"
RPM_HASH = "9fff0d8b966186115e76882231eb42ed50b1050f8c747d6e2b635af9f3172a61785a673eea7c22984b8fb0499c5b96b88d999f947d8c1c25195b6a24ccc681cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cppy \
python310-cppy \
python3dist-cppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
