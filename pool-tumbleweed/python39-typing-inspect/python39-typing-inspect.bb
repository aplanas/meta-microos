SUMMARY = "Python runtime inspection utilities for typing"
DESCRIPTION = "Python runtime inspection utilities for typing module."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python39-typing-inspect-0.8.0-2.3.noarch.rpm"
RPM_HASH = "6ff2d39d0593192247692e339db273cce4852725a2b9c6d59b452417864706894090f93e8e4eec5894bb4d7948356665b8e089eeb101f0b146f8d70d54251c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-typing-inspect \
python39-typing-inspect \
python3dist-typing-inspect"

RDEPENDS:${PN} += "python-abi \
python39-mypy-extensions \
python39-typing-extensions"

inherit rpm
