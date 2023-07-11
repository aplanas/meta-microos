SUMMARY = "Low-level, pure Python DBus protocol wrapper"
DESCRIPTION = "This is a low-level, pure Python DBus protocol client. It has an I/O-free \
core, and integration modules for different event loops."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python310-jeepney-0.8.0-2.3.noarch.rpm"
RPM_HASH = "ccb2da31564a86233dcce777f9f74084d351e89f232ee969ea53a7c22b4c282ce913ce3efbd5aff6ff76d8f92b2e9c2e602f5f681bd9b29fbcc64f2c9a59b81e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jeepney \
python310-jeepney \
python3dist-jeepney"

RDEPENDS:${PN} += "python-abi"

inherit rpm
