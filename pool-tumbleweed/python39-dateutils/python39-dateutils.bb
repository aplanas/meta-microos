SUMMARY = "Python library for working with date and datetime objects"
DESCRIPTION = "Python library for working with date and datetime objects."
LICENSE = "0BSD"

PV = "0.6.12"

RPM_NAME = "python39-dateutils-0.6.12-2.1.noarch.rpm"
RPM_HASH = "d0b111e7ba9946bd513726a5386cbd15bbe2756e1d7e6be4abe9961885c1d5abf80e50ffe327c53c87822e4de9c5842d036c349f8f6590fe4923ad8ccb31a0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dateutils \
python39-dateutils \
python3dist-dateutils"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil \
python39-pytz"

inherit rpm
