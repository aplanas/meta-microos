SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-stack-data-0.6.2-4.1.noarch.rpm"
RPM_HASH = "78bec9df782ab40d489e7a807024224858e602f6f1c4f52231f897bb02dbac1c0c57828b421b599a4c6404b02d7ff8c8f188c9cfbe80e687140ac2339d69892f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-stack-data \
python310-stack-data \
python3dist-stack-data"

RDEPENDS:${PN} += "python-abi \
python310-asttokens \
python310-executing \
python310-pure-eval"

inherit rpm
