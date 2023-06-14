SUMMARY = "Python currency and money classes"
DESCRIPTION = "Provides Currency and Money classes for use in your Python code."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python310-py-moneyed-3.0-1.3.noarch.rpm"
RPM_HASH = "9a8199ee168196f98e94d9f5d1a621a3d4c8ef00bbb5b0518370c8c31b1bc05a483087bdacc2c5b28c246c69e4f7615eeba0cecfa1a84a19cda778b76a5ccb40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-moneyed \
python3.10dist-py-moneyed \
python310-py-moneyed \
python3dist-py-moneyed"

RDEPENDS:${PN} += "python-abi \
python310-Babel \
python310-typing-extensions"

inherit rpm
