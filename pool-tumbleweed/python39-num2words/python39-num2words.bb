SUMMARY = "Modules to convert numbers to words"
DESCRIPTION = "num2words is a library that converts numbers like '42' to words like 'forty-two'. \
It supports multiple languages and can even generate ordinal numbers like 'forty-second' \
(although this last feature is a bit buggy for some languages at the moment)."
LICENSE = "LGPL-2.1-only"

PV = "0.5.12"

RPM_NAME = "python39-num2words-0.5.12-1.6.noarch.rpm"
RPM_HASH = "e8eef2fd16ec321f354ed04df85e4b0afa6a36c8e6974d7f7b54c6c59dd97b28acf49413284730b42e68758408c40116538e9d46dca2ab45ad63414fada71517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-num2words \
python39-num2words \
python3dist-num2words"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docopt \
update-alternatives"

inherit rpm
