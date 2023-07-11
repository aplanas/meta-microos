SUMMARY = "Translation Files Finder"
DESCRIPTION = "A translation file finder for Weblate, translation tool with tight version control integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.15"

RPM_NAME = "python310-translation-finder-2.15-1.4.noarch.rpm"
RPM_HASH = "40a5d36a5adac0a6fc5d815d603310a21b5526aed71b9f23dd9268c88797670295bb46b02293b7772849bf73ed5f7cd0797045b72a98342682eeafef9bda5f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-translation-finder \
python310-translation-finder \
python3dist-translation-finder"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-ruamel.yaml \
python310-setuptools \
python310-weblate-language-data \
update-alternatives"

inherit rpm
