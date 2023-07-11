SUMMARY = "Brave's adblock library in Python"
DESCRIPTION = "Python wrapper for Brave's adblocking library."
LICENSE = "Apache-2.0 | MIT"

PV = "0.6.0"

RPM_NAME = "python311-adblock-0.6.0-2.4.aarch64.rpm"
RPM_HASH = "800a0880012f0a8750c6f68533cc20c148c78742d81eabf16f8db4f66a5c776d478451a686e69a8e1c16437bbf6830eda1932438e46b2754dd0fb99706567f8b"

RPROVIDES:${PN} += "python3-adblock \
python3.11dist-adblock \
python311-adblock \
python3dist-adblock"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
