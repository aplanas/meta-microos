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

RPM_NAME = "transifex-client-0.14.4-1.4.noarch.rpm"
RPM_HASH = "d544672a4507079b0e796545d57f051c4a2c00fa091066d0f460a7f2f3231c3394ffc617843a65f2a21dba7f57550e9d94f908d853b09d12321c03585e2ecaf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-transifex-client \
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
