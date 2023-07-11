SUMMARY = "A linter for YAML files"
DESCRIPTION = "A linter for YAML files. \
 \
YAMLlint does not only check for syntax validity, but for weirdnesses like key \
repetition and cosmetic problems such as lines length, trailing spaces, \
indentation, etc."
LICENSE = "GPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "python310-yamllint-1.32.0-1.3.noarch.rpm"
RPM_HASH = "a3d4e054d30250034cda7aebbd9b2a90ab1afd88a3b6d0724f117ec79a42e0693405083b979f2ecef9b76938f4983d57dfedacfad8be9e7db6f28a52fdb385f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yamllint \
python310-yamllint \
python3dist-yamllint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-pathspec \
update-alternatives"

inherit rpm
