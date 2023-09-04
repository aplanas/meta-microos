SUMMARY = "Access Java classes from Python"
DESCRIPTION = "Access Java classes from Python."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-pyjnius-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "87c785107d18f83657ca0028ad44e0a7d2b3af2ef0af6d6c080288c9a8697e99bd45fef3a900f9c5898108c6aafc297e7f44babb352027a0e36d02071489eb1d"

RPROVIDES:${PN} += "python3.10dist-pyjnius \
python310-pyjnius \
python3dist-pyjnius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Cython"

inherit rpm
