SUMMARY = "Python currency and money classes"
DESCRIPTION = "Provides Currency and Money classes for use in your Python code."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python39-py-moneyed-3.0-1.3.noarch.rpm"
RPM_HASH = "bba0adad3b31bd5c9e88f31c2deb36aa126aeaf1ba375313f1bfe70b47a27cda24f3c418ea18f9a7db182829e2408f30f8f5542ce7f7978ab68295618106f204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(py-moneyed) \
python39-py-moneyed \
python3dist(py-moneyed)"
RDEPENDS:${PN} += "python(abi) \
python39-Babel \
python39-typing-extensions"

inherit rpm
