SUMMARY = "A linter for YAML files"
DESCRIPTION = "A linter for YAML files. \
 \
YAMLlint does not only check for syntax validity, but for weirdnesses like key \
repetition and cosmetic problems such as lines length, trailing spaces, \
indentation, etc."
LICENSE = "GPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "python39-yamllint-1.32.0-1.3.noarch.rpm"
RPM_HASH = "78f7d8d71b6babd6a53bc492a3cbdf40dc9719a77a066f695def2d598fdeff77347eb1764681eca4110aeb55fd80e3ddaa6eef471d800c8cab3a53d442b22cb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yamllint \
python39-yamllint \
python3dist-yamllint"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-pathspec \
update-alternatives"

inherit rpm
