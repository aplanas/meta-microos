SUMMARY = "A python library adding a json log formatter"
DESCRIPTION = "A python library adding a json log formatter."
LICENSE = "BSD-2-Clause"

PV = "2.0.7"

RPM_NAME = "python311-python-json-logger-2.0.7-1.1.noarch.rpm"
RPM_HASH = "5777f88d7207e0619cab6384961665078738e693b4b792b8bc866ce97478564e095376ad5f0a8366a217783ce534e02be3047c53b1e5c5ec63fe160cfaf85468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-json-logger \
python311-python-json-logger \
python3dist-python-json-logger"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
