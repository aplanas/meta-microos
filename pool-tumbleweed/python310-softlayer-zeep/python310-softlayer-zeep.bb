SUMMARY = "A modern/fast Python SOAP client based on lxml / requests"
DESCRIPTION = "A modern/fast Python SOAP client based on lxml / requests"
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python310-softlayer-zeep-5.0.0-2.1.noarch.rpm"
RPM_HASH = "fac58fc65ff50348b80567fa3490d289443f13c5bce2474243497b663d7aa948c675b87685da0fba89cb58838203c2afaae13d84475a38b7b7190bd841fd3226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-softlayer-zeep \
python310-softlayer-zeep \
python310-zeep \
python3dist-softlayer-zeep"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-isodate \
python310-lxml \
python310-platformdirs \
python310-pytz \
python310-requests \
python310-requests-file \
python310-requests-toolbelt"

inherit rpm
