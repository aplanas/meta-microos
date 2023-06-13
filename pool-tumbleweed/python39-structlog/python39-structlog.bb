SUMMARY = "Structured Logging for Python"
DESCRIPTION = "structlog makes logging in Python less painful and more powerful by adding \
structure to your log entries. \
 \
It’s up to you whether you want structlog to take care about the output of your \
log entries or whether you prefer to forward them to an existing logging system \
like the standard library’s logging module."
LICENSE = "Apache-2.0 | MIT"

PV = "22.1.0"

RPM_NAME = "python39-structlog-22.1.0-2.3.noarch.rpm"
RPM_HASH = "e93615377194e0a5eda846eb8755d519cff24dd8e2983bfb6baee93220af02d8ff073891097dae9681a428a475664edaf51c84692a0330008d00c7a24c68aa7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(structlog) \
python39-structlog \
python3dist(structlog)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
