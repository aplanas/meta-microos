SUMMARY = "Python currency and money classes"
DESCRIPTION = "Provides Currency and Money classes for use in your Python code."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python311-py-moneyed-3.0-1.5.noarch.rpm"
RPM_HASH = "7180330ec59f89780531eb6c844bf3aa5426304e3585eec323de480fc494ee2983a35ca2dabd1b39b4caf6fa9ba99cad607b44292f92112286a35c7d38a19487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-moneyed \
python3.11dist-py-moneyed \
python311-py-moneyed \
python3dist-py-moneyed"

RDEPENDS:${PN} += "python-abi \
python311-Babel \
python311-typing-extensions"

inherit rpm
