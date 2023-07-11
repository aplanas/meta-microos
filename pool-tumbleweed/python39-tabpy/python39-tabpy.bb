SUMMARY = "Tableau Python service"
DESCRIPTION = "Tableau service to run Python scripts."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python39-tabpy-2.5.0-1.10.noarch.rpm"
RPM_HASH = "4339706db3866c5a7d6c71bcf505f0503afaec2a5ed83b7e91ed23a1dab590109febfab0c5aae80e89ecd3b7eb3bcd610c5ae160c9d005c28cd406900550f637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tabpy \
python39-tabpy \
python3dist-tabpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
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
