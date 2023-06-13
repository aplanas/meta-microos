SUMMARY = "A tool for modernizing Python code using lib2to3"
DESCRIPTION = "A hack on top of fissix for modernizing Python code."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "0.8.0"

RPM_NAME = "python311-modernize-0.8.0-2.9.noarch.rpm"
RPM_HASH = "05f450e52da4e9186d8a71a51831141250aad86e470db70cee3c70e86e18d11303572ebcc0127d16a39846a75da6da88bf2a8fd09b83a56c9f80918d82f0a51e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(modernize) \
python311-modernize \
python3dist(modernize)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-dbm \
python311-fissix \
update-alternatives"

inherit rpm
