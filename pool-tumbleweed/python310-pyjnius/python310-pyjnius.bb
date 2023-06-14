SUMMARY = "Access Java classes from Python"
DESCRIPTION = "Access Java classes from Python."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python310-pyjnius-1.4.2-2.4.aarch64.rpm"
RPM_HASH = "3d968f407620dbc63b5a83fa2e97b238c8d96af05ff2f5fee1dde15e2c2cbcc644b22a947d32c8b0ad8a773803c74e82e4265ffea5571dcf38b85bd5861fd778"

RPROVIDES:${PN} += "python3-pyjnius \
python3.10dist-pyjnius \
python310-pyjnius \
python3dist-pyjnius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Cython"

inherit rpm
