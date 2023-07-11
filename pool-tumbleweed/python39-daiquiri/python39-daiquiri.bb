SUMMARY = "Library to configure Python logging"
DESCRIPTION = "The daiquiri library provides a way to configure logging. It also \
provides some custom formatters and handlers."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python39-daiquiri-3.2.1-1.5.noarch.rpm"
RPM_HASH = "8a32502b5392a72e322a996062ff02cadb96dc654f5324a968dcacfc7a99c88d9f1a922f0903d894a22a16e57a4b60f78e8d9343ff8650a39f3bca659739d67b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-daiquiri \
python39-daiquiri \
python3dist-daiquiri"

RDEPENDS:${PN} += "python-abi \
python39-python-json-logger"

inherit rpm
