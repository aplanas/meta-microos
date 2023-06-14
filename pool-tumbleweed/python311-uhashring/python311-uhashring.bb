SUMMARY = "Full featured consistent hashing python library compatible with ketama"
DESCRIPTION = "Full featured consistent hashing python library compatible with ketama."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python311-uhashring-2.3-1.1.noarch.rpm"
RPM_HASH = "199b936e2e174ca52ddf4f35aeffc905e35ad4119d0d5d7aa8a754761bc42eddbcb119a150e20618eab2854fa0bd368c07aa3df8596aa08a9eff202bf6b21664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-uhashring \
python311-uhashring \
python3dist-uhashring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
