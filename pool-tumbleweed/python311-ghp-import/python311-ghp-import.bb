SUMMARY = "Utility to import docs into a gh-pages branch"
DESCRIPTION = "A utility to import docs to a gh-pages branch. \
This will destroy the gh-pages branch. This script assumes that \
gh-pages is 100% derivative. You should never edit files in your \
gh-pages branch by hand if you're using this script because you \
will lose your work."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python311-ghp-import-2.1.0-2.3.noarch.rpm"
RPM_HASH = "66209fd45adb576e7ca5220727096e74eece30c79313db88ab54aac3a18cd11e58f54e41d8c51d9cd11080986933b20fc8744397ca36fb15e3e0a0c9f67cdd59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ghp-import \
python311-ghp-import \
python3dist-ghp-import"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-dateutil \
update-alternatives"

inherit rpm
