SUMMARY = "Miscellaneous utils for asyncio"
DESCRIPTION = "Miscellaneous utils for asyncio."
LICENSE = "MIT"

PV = "17.3.0"

RPM_NAME = "python310-aiomisc-17.3.0-1.3.noarch.rpm"
RPM_HASH = "7bcde40a106cea6fdb3c0460e3f2a2eef23bfb857aba3f209e5aaaf51abfc02e2653582767ccf3413e94c9ecd23f40f3bb3e673904d1813cdf506b794a5bb8e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiomisc \
python310-aiomisc \
python3dist-aiomisc"

RDEPENDS:${PN} += "python-abi \
python310-colorlog \
python310-logging-journald"

inherit rpm
