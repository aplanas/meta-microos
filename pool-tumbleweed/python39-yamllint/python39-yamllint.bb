SUMMARY = "A linter for YAML files"
DESCRIPTION = "A linter for YAML files. \
 \
YAMLlint does not only check for syntax validity, but for weirdnesses like key \
repetition and cosmetic problems such as lines length, trailing spaces, \
indentation, etc."
LICENSE = "GPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "python39-yamllint-1.32.0-1.1.noarch.rpm"
RPM_HASH = "6e003ab8fc2aba4cb80b8916a31d41c1dad6efd6d4d20a8f75a15e82d75ad5241cc06732c0b7b5a4048082dc9aba7a885338af5e3460f1c72bee4e817b468798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(yamllint) \
python39-yamllint \
python3dist(yamllint)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyYAML \
python39-pathspec \
update-alternatives"

inherit rpm
