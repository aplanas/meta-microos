SUMMARY = "Library to configure Python logging"
DESCRIPTION = "The daiquiri library provides a way to configure logging. It also \
provides some custom formatters and handlers."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python311-daiquiri-3.2.1-1.5.noarch.rpm"
RPM_HASH = "d6c6f5af8ae388161a61b387658dbbd7e90823b60779221354e7e1ec2c16890e9548ea460282d875fcc1e0b21e78b6c7dbaab5fb5b4518448959ceeb9a3455ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-daiquiri \
python3.11dist-daiquiri \
python311-daiquiri \
python3dist-daiquiri"

RDEPENDS:${PN} += "python-abi \
python311-python-json-logger"

inherit rpm
