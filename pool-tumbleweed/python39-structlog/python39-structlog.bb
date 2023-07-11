SUMMARY = "Structured Logging for Python"
DESCRIPTION = "structlog makes logging in Python less painful and more powerful by adding \
structure to your log entries. \
 \
It’s up to you whether you want structlog to take care about the output of your \
log entries or whether you prefer to forward them to an existing logging system \
like the standard library’s logging module."
LICENSE = "Apache-2.0 | MIT"

PV = "22.1.0"

RPM_NAME = "python39-structlog-22.1.0-2.5.noarch.rpm"
RPM_HASH = "f80efad88b43f11e940336c9a8f93a673b3344bac3f777dc04f6a26936d59bcf67d2921bc68fd6f1be916ad5a52277f7f10b1f6fb2a534d393e28af1b9ab52e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-structlog \
python39-structlog \
python3dist-structlog"

RDEPENDS:${PN} += "python-abi"

inherit rpm
