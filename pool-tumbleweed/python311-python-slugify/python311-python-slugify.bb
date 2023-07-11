SUMMARY = "Slugify application that handles Unicode"
DESCRIPTION = "A Python Slugify application that handles Unicode."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python311-python-slugify-5.0.2-2.3.noarch.rpm"
RPM_HASH = "a973bff4e938975c243b3fcd52204504386b4457430b4ee0f46ac043dc75f757616fe43b138bac38654327c6fb14edfcda0b27c3e7d078d5d3753532525aee3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-slugify \
python3.11dist-python-slugify \
python311-python-slugify \
python3dist-python-slugify"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
python311-text-unidecode \
update-alternatives"

inherit rpm
