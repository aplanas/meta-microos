SUMMARY = "Translation Files Finder"
DESCRIPTION = "A translation file finder for Weblate, translation tool with tight version control integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.15"

RPM_NAME = "python39-translation-finder-2.15-1.4.noarch.rpm"
RPM_HASH = "b1a963d30f844cdf0a39a56e21b90b2cc121a420189147d90df64862b41855db10811f7088a66a7f34ee58b0c8f69bce3992c0b4e92036f8bba79214b1931c46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-translation-finder \
python39-translation-finder \
python3dist-translation-finder"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-ruamel.yaml \
python39-setuptools \
python39-weblate-language-data \
update-alternatives"

inherit rpm
