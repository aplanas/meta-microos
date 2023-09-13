SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python310-psutil-5.9.5-3.1.aarch64.rpm"
RPM_HASH = "6a894d63f6c8f884bc97ecea53433ddb20a0db1c6e79a635a1bc6772d3dee9503d94f40a63b93d5cd79083835b33a8cff93c4205f2e669b96e7e5a34bc29305d"

RPROVIDES:${PN} += "python3.10dist-psutil \
python310-psutil \
python3dist-psutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
procps \
python-abi"

inherit rpm
