SUMMARY = "Translation Files Finder"
DESCRIPTION = "A translation file finder for Weblate, translation tool with tight version control integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.15"

RPM_NAME = "python311-translation-finder-2.15-1.2.noarch.rpm"
RPM_HASH = "92f67759be4b703f91c41966df00bfe79e71441cd6915500558821321a9c031e74dce55e05a9583036614b0b1b4dcea5e04458ce0f137b831620d90222d390ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(translation-finder) \
python311-translation-finder \
python3dist(translation-finder)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-ruamel.yaml \
python311-setuptools \
python311-weblate-language-data \
update-alternatives"

inherit rpm
