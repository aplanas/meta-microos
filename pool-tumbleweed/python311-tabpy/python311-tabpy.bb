SUMMARY = "Tableau Python service"
DESCRIPTION = "Tableau service to run Python scripts."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python311-tabpy-2.5.0-1.10.noarch.rpm"
RPM_HASH = "56c10b90fde378d1d175f43d16332b9e9268dd003d1ca339769045af31c011a19763e12846066679ee0132b5c08696ef1adaeb20b54284f371cb04cf101bf5e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tabpy \
python3.11dist-tabpy \
python311-tabpy \
python3dist-tabpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Twisted \
python311-cloudpickle \
python311-docopt \
python311-genson \
python311-jsonschema \
python311-pyOpenSSL \
python311-requests \
python311-simplejson \
python311-tornado"

inherit rpm
