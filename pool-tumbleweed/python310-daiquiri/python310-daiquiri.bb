SUMMARY = "Library to configure Python logging"
DESCRIPTION = "The daiquiri library provides a way to configure logging. It also \
provides some custom formatters and handlers."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python310-daiquiri-3.2.1-1.3.noarch.rpm"
RPM_HASH = "f1383df7401fcc6d686c048bf1b787e6b64eb2b3de88fbcec2bd8b4591525f91da14f203219e6ec52a35480c3e3ffa27005f0a8155bf1409ef14d07bb5c58e4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-daiquiri \
python3.10dist(daiquiri) \
python310-daiquiri \
python3dist(daiquiri)"
RDEPENDS:${PN} += "python(abi) \
python310-python-json-logger"

inherit rpm
