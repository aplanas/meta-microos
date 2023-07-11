SUMMARY = "Low-level, pure Python DBus protocol wrapper"
DESCRIPTION = "This is a low-level, pure Python DBus protocol client. It has an I/O-free \
core, and integration modules for different event loops."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python311-jeepney-0.8.0-2.3.noarch.rpm"
RPM_HASH = "f0486d31e12798472f1967463eb0f700d51a8c854c9d2cb9f7689daf39aed2c88bcb6047c69367b5db897fb4f09ffe3927fbb06568f326e0192ce9ca9d054c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jeepney \
python3.11dist-jeepney \
python311-jeepney \
python3dist-jeepney"

RDEPENDS:${PN} += "python-abi"

inherit rpm
