SUMMARY = "Structured Logging for Python"
DESCRIPTION = "structlog makes logging in Python less painful and more powerful by adding \
structure to your log entries. \
 \
It’s up to you whether you want structlog to take care about the output of your \
log entries or whether you prefer to forward them to an existing logging system \
like the standard library’s logging module."
LICENSE = "Apache-2.0 | MIT"

PV = "22.1.0"

RPM_NAME = "python311-structlog-22.1.0-2.5.noarch.rpm"
RPM_HASH = "b9d4f02682542ab2fb65bc57deb51394604e4eabab56cfd43412ebd5ebbe9ff9cd33fc57c9a268d745839801090946bd0f109156023404bec448a616cd419dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-structlog \
python3.11dist-structlog \
python311-structlog \
python3dist-structlog"

RDEPENDS:${PN} += "python-abi"

inherit rpm
