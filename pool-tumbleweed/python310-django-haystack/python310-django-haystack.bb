SUMMARY = "Pluggable search for Django"
DESCRIPTION = "Pluggable search for Django."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-django-haystack-3.2.1-2.1.noarch.rpm"
RPM_HASH = "4a5ed231191d5f43dde965c8efd3b900160c894f03df4b8cf37beb7d1bbf47ef6a7db8bd0fc80ed2b4ea722bdaa89ae41644454fa5577d4bb545ee4676386dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-haystack \
python310-django-haystack \
python3dist-django-haystack"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
