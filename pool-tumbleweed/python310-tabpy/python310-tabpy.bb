SUMMARY = "Tableau Python service"
DESCRIPTION = "Tableau service to run Python scripts."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python310-tabpy-2.5.0-1.10.noarch.rpm"
RPM_HASH = "d410a7beaf52514a97940a753b87b9dba5bff04b77f85aa9b25e1f88c017b07f5bb0e18dfb2eebb33c10a191e0f035261d0b70b2ffc611eaaac3cab1be194a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tabpy \
python310-tabpy \
python3dist-tabpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Twisted \
python310-cloudpickle \
python310-docopt \
python310-genson \
python310-jsonschema \
python310-pyOpenSSL \
python310-requests \
python310-simplejson \
python310-tornado"

inherit rpm
