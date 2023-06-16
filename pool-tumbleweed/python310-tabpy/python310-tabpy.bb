SUMMARY = "Tableau Python service"
DESCRIPTION = "Tableau service to run Python scripts."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python310-tabpy-2.5.0-1.8.noarch.rpm"
RPM_HASH = "823c15163475f4166b197a89b787037f5667119aa77dee74251f759d7ac0240a3ef4f505255f61898caf34b1650105dfdad78840effb2839166f462c4e3b4595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tabpy \
python3.10dist-tabpy \
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
