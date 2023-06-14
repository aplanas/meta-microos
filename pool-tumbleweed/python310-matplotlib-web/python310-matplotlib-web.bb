SUMMARY = "Web backend for python310-matplotlib"
DESCRIPTION = "This package includes the browser-based webagg backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-web-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "ecf08606d7075795132ae778a24937f3a7ba5814e585c5b32a07606a1581a315585b17176cd445edc52c8efa3a709bd9218b4999d486bb3a8b44955a7b754346"

RPROVIDES:${PN} += "python3-matplotlib-web \
python310-matplotlib-web"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-tornado"

inherit rpm
