SUMMARY = "Python library for working with date and datetime objects"
DESCRIPTION = "Python library for working with date and datetime objects."
LICENSE = "0BSD"

PV = "0.6.12"

RPM_NAME = "python310-dateutils-0.6.12-1.3.noarch.rpm"
RPM_HASH = "1384b1b157a61c012c2d5f88ceebf0aca9f1d3d098dc6eb101c7c652f145110578530c0212609d7eb34d09223dc9bf2184f9b60dff4a3797edcc5aa537f8bb9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dateutils \
python3.10dist(dateutils) \
python310-dateutils \
python3dist(dateutils)"
RDEPENDS:${PN} += "python(abi) \
python310-python-dateutil \
python310-pytz"

inherit rpm
