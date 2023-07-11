SUMMARY = "EngineIO server"
DESCRIPTION = "Python implementation of the Engine.IO realtime server."
LICENSE = "MIT"

PV = "4.3.4"

RPM_NAME = "python39-python-engineio-4.3.4-2.4.noarch.rpm"
RPM_HASH = "dc5673687f77086b0c1da802cb91f4bcc76b19d165351e98048cdf6848523d92638831e86d2e58c6f1ce05e03a20fd17dea7cf5029cae9f6d03d8c1fa6333c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-engineio \
python39-python-engineio \
python3dist-python-engineio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
