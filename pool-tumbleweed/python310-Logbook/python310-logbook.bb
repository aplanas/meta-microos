SUMMARY = "A logging replacement for Python"
DESCRIPTION = "An alternative logging implementation for python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python310-Logbook-1.5.3-4.1.aarch64.rpm"
RPM_HASH = "b2627002284bd6a4b28c8346164b2c4ddd044337f72465a154c60f5e78e28d3ab9676365a380e65d079830d51cf3dc15ee4d42448f540ef15219b461b10db555"

RPROVIDES:${PN} += "python3.10dist-logbook \
python310-Logbook \
python3dist-logbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
