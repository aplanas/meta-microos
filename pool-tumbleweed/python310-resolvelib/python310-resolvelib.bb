SUMMARY = "Module to resolve abstract dependencies into concrete ones"
DESCRIPTION = "A Python module to resolve abstract dependencies into concrete ones."
LICENSE = "ISC"

PV = "0.8.1"

RPM_NAME = "python310-resolvelib-0.8.1-7.3.noarch.rpm"
RPM_HASH = "38254c35fed8df9a0307441ceb8f252aede2dd2efd0c301bc428954d1af58746b9d262cfe4352758107c549afde0197d27ee8c71d3c8d324aff467c2047a4395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-resolvelib \
python310-resolvelib \
python3dist-resolvelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
