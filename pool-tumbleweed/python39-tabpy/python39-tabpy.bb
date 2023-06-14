SUMMARY = "Tableau Python service"
DESCRIPTION = "Tableau service to run Python scripts."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python39-tabpy-2.5.0-1.8.noarch.rpm"
RPM_HASH = "c5ce997dd908845c45accf54077a80e7c045efd266ea5e4c254e784bbcdf7481e1f7d8bde4c4a7e60f65cf11973bb49d7a96f24c572549e48f469f1156f987fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tabpy \
python39-tabpy \
python3dist-tabpy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-Twisted \
python39-cloudpickle \
python39-docopt \
python39-genson \
python39-jsonschema \
python39-pyOpenSSL \
python39-requests \
python39-simplejson \
python39-tornado"

inherit rpm
