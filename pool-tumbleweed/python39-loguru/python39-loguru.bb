SUMMARY = "Python logging component with a simple interface"
DESCRIPTION = "Python logging component providing a single object \
which dispatches log messages to configured handlers."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-loguru-0.7.0-2.3.noarch.rpm"
RPM_HASH = "be9d2cf8356f4e47fd87bc74a3de0a364ebdac13d2003c38e26e1a5126e94e0ed5ff9f8f5453226a490ee94191e3038d25343e858686773f6a19ca30ed42a735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-loguru \
python39-loguru \
python3dist-loguru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
