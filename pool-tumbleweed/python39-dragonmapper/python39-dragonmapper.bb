SUMMARY = "Identification and conversion functions for Chinese text processing"
DESCRIPTION = "Identification and conversion functions for Chinese text processing."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "python39-dragonmapper-0.2.6-3.3.noarch.rpm"
RPM_HASH = "53e1a14e24bf551a151d2809313d6430371d536b6ed64f438aa37549a599a1f2740104db02231a68f1b8a9004bbd65aa083103ec721cc1dcd2f3eda97cf31e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dragonmapper \
python39-dragonmapper \
python3dist-dragonmapper"

RDEPENDS:${PN} += "python-abi \
python39-hanzidentifier \
python39-zhon"

inherit rpm
