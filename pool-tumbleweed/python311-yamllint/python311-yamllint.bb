SUMMARY = "A linter for YAML files"
DESCRIPTION = "A linter for YAML files. \
 \
YAMLlint does not only check for syntax validity, but for weirdnesses like key \
repetition and cosmetic problems such as lines length, trailing spaces, \
indentation, etc."
LICENSE = "GPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "python311-yamllint-1.32.0-1.1.noarch.rpm"
RPM_HASH = "d47f9f53b779843c9d93430218f484580f7b5478ecb6f2cbf1d865b33ba22eb44edd21f95ddbb2f5de4c6b4f962fff9702bd26fd86afa618664d69eb61f5777d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-yamllint \
python311-yamllint \
python3dist-yamllint"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-PyYAML \
python311-pathspec \
update-alternatives"

inherit rpm
