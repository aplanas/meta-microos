SUMMARY = "Python Universal Charset detector"
DESCRIPTION = "Python Universal Charset detector."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-charset-normalizer-3.1.0-2.3.noarch.rpm"
RPM_HASH = "a826cfa2db169b903efce63fc96ef82a8b5c5eca83f62fe2d5492b0f8177021695c7873258f114ac1eb2855c5ede2572bd58a16aa6205d9c2e2f1d4c932a09c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-charset-normalizer \
python310-charset-normalizer \
python3dist-charset-normalizer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
