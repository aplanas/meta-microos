SUMMARY = "Slugify application that handles Unicode"
DESCRIPTION = "A Python Slugify application that handles Unicode."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python39-python-slugify-5.0.2-2.3.noarch.rpm"
RPM_HASH = "1232a9670094135269fe64f95937fdc2c255f657ef9dd4089c37f4f8607686781844b6347931d2396093a697a170abfe3effa74218ad2192097fe5fb06ebf5f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-slugify \
python39-python-slugify \
python3dist-python-slugify"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
python39-text-unidecode \
update-alternatives"

inherit rpm
