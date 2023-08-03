SUMMARY = "Natural sorting in Python"
DESCRIPTION = "Natsort provides a function natsorted that helps sort lists \
'naturally' ('naturally' is rather ill-defined, but in general it means \
sorting based on meaning and not computer code point)."
LICENSE = "MIT"

PV = "8.4.0"

RPM_NAME = "python310-natsort-8.4.0-1.1.noarch.rpm"
RPM_HASH = "8e33e4762e4f1f7c4f6620579dba348010cc3fd1c9aeb0d08e94d6fe35d6ca437a39a4070680e8a0acb2b15af819647687fa35f50d213ca31e683198fd9de216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-natsort \
python310-natsort \
python3dist-natsort"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
