SUMMARY = "A goodie-bag of unix shell and environment tools for pytest"
DESCRIPTION = "This library is a goodie-bag of Unix shell and environment management \
tools for automated tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-shutil-1.7.0-7.3.noarch.rpm"
RPM_HASH = "0ff3efa7861c55e909c19a8834381ca0542df7668e9f1ef06de00765d0c44a380d28f480219f1b6e7b20291f102068b9fa61fd717c3a0ae9b60fe73021e7ed2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-shutil \
python39-pytest-shutil \
python3dist-pytest-shutil"

RDEPENDS:${PN} += "python-abi \
python39-execnet \
python39-path \
python39-pytest \
python39-six \
python39-termcolor"

inherit rpm
