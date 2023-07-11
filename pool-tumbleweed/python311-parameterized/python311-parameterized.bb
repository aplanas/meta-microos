SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "python311-parameterized-0.9.0-1.3.noarch.rpm"
RPM_HASH = "be2b437cc0f83b9ad140c3b5d17d58cf738b13076159ee218e7861ec7c57067269cece87c5cf2b30af99566938c06f969dda08076f6cee674033054b368146b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parameterized \
python3.11dist-parameterized \
python311-parameterized \
python3dist-parameterized"

RDEPENDS:${PN} += "python-abi"

inherit rpm
