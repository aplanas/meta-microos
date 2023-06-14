SUMMARY = "Web Services Made Easy"
DESCRIPTION = "Web Service Made Easy (WSME) is a way to implement webservices \
in Python web applications. \
It is originally a rewrite of TGWebServices \
with focus on extensibility, framework-independence and improved type handling."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-WSME-0.11.0-2.6.noarch.rpm"
RPM_HASH = "f12e1d7e4da6648639e4043a93aa4ee27fccd3f0af4189ce99497a3bf94908bc60fbe6784e67f9f674b87aec6980d9b41347b408dcdcc1d71f7b7f981b6ca434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wsme \
python39-WSME \
python3dist-wsme"

RDEPENDS:${PN} += "python-abi \
python39-WebOb \
python39-netaddr \
python39-pytz \
python39-simplegeneric"

inherit rpm
