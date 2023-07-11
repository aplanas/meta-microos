SUMMARY = "Module to resolve abstract dependencies into concrete ones"
DESCRIPTION = "A Python module to resolve abstract dependencies into concrete ones."
LICENSE = "ISC"

PV = "0.8.1"

RPM_NAME = "python311-resolvelib-0.8.1-7.3.noarch.rpm"
RPM_HASH = "9ee930c10beaa09c766346389d6ed9f25be0643d14b497fcd9adea7c4a271ddb24728e981c37a7d92d7c654d8715eb0219b2ed54a72e8294bf1c60a3a6ec02fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-resolvelib \
python3.11dist-resolvelib \
python311-resolvelib \
python3dist-resolvelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
