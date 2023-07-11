SUMMARY = "Low-level, pure Python DBus protocol wrapper"
DESCRIPTION = "This is a low-level, pure Python DBus protocol client. It has an I/O-free \
core, and integration modules for different event loops."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python39-jeepney-0.8.0-2.3.noarch.rpm"
RPM_HASH = "eac04ad6150507b0cfd1ca04608827f6dd75d9d3d07fbd8173835f1cfe7f6405a0a8efe609a07233f1621d73691fcea10a758a872785fecd2e745d8827cdc97b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jeepney \
python39-jeepney \
python3dist-jeepney"

RDEPENDS:${PN} += "python-abi"

inherit rpm
