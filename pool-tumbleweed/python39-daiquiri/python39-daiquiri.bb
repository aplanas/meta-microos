SUMMARY = "Library to configure Python logging"
DESCRIPTION = "The daiquiri library provides a way to configure logging. It also \
provides some custom formatters and handlers."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python39-daiquiri-3.2.1-1.3.noarch.rpm"
RPM_HASH = "f9ebf486e1458558985dc0320707575f5fa20777b81e130247b7e800629b875abcddcdd44c44be7a6d1bc8c30e7ec328e9838749a17aabbe55de4e4b50c12750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(daiquiri) \
python39-daiquiri \
python3dist(daiquiri)"
RDEPENDS:${PN} += "python(abi) \
python39-python-json-logger"

inherit rpm
