SUMMARY = "A linter for YAML files"
DESCRIPTION = "A linter for YAML files. \
 \
YAMLlint does not only check for syntax validity, but for weirdnesses like key \
repetition and cosmetic problems such as lines length, trailing spaces, \
indentation, etc."
LICENSE = "GPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "python311-yamllint-1.32.0-1.3.noarch.rpm"
RPM_HASH = "906640be71146f9e293395f40b5a4aa9703f87ebe0c2ca4ce061c7925ba90d74fa700b18272eaa231d9ef0bff1bfb04e930b14c3fa251b605a7f4460916d0e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamllint \
python3.11dist-yamllint \
python311-yamllint \
python3dist-yamllint"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-pathspec \
update-alternatives"

inherit rpm
