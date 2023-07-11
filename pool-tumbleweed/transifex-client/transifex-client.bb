SUMMARY = "Transifex Command-line Client"
DESCRIPTION = "The Transifex Command-line Client is a command line tool that enables you \
to easily manage your translations within a project without the need of \
an elaborate UI system. \
 \
You can use the command-line client to easily create new resources, map \
locale files to translations and synchronize your Transifex project with \
your local repository and vice verca. Translators and localization \
managers can also use it to handle large volumes of translation files \
easily and without much hassle."
LICENSE = "GPL-2.0-only"

PV = "0.14.4"

RPM_NAME = "transifex-client-0.14.4-2.1.noarch.rpm"
RPM_HASH = "f27b98e966b051d749ac23aed4c32613838a803541c7b4365819fb4b56ae7abcbba1bfa0e6160211474a928ded863395db0d7750046f38b3277f1b323ab58707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-transifex-client \
python3dist-transifex-client \
transifex-client"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-python-slugify \
python3-requests \
python3-setuptools \
python3-urllib3 \
update-alternatives"

inherit rpm
