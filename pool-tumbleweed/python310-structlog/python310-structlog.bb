SUMMARY = "Structured Logging for Python"
DESCRIPTION = "structlog makes logging in Python less painful and more powerful by adding \
structure to your log entries. \
 \
It’s up to you whether you want structlog to take care about the output of your \
log entries or whether you prefer to forward them to an existing logging system \
like the standard library’s logging module."
LICENSE = "Apache-2.0 | MIT"

PV = "22.1.0"

RPM_NAME = "python310-structlog-22.1.0-2.5.noarch.rpm"
RPM_HASH = "9b861a5958d5cd9088ad588bfe9e4ec3df4c5797f90a35b8eaecb075752916930e8af26fb0fe9fff6251a87a05100c3f266ef970884949c0f5d56f73cbb5fd4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-structlog \
python310-structlog \
python3dist-structlog"

RDEPENDS:${PN} += "python-abi"

inherit rpm
