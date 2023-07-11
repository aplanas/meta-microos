SUMMARY = "Python Universal Charset detector"
DESCRIPTION = "Python Universal Charset detector."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-charset-normalizer-3.1.0-2.3.noarch.rpm"
RPM_HASH = "611856b815cc57f73eba474ffb38169e2fae91d8d8345deb5e4335bb6b7e4d30d488c419c375f9ce5a3e22679232a9910c6c020f18474fc5fbcb8ce3e1335c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-charset-normalizer \
python3.11dist-charset-normalizer \
python311-charset-normalizer \
python3dist-charset-normalizer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
