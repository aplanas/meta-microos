SUMMARY = "A Python library to work with countries and languages"
DESCRIPTION = "BabelFish is a Python library to work with countries and languages."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-babelfish-0.6.0-1.9.noarch.rpm"
RPM_HASH = "6d6c9529cc59d42cb49beedd93f97c32d77d451e42197e4b972966c54212fd8940c39c1febdcd6825c18544905c3180f1df2bf8aa1750514e28afec673d2db02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-babelfish \
python310-babelfish \
python3dist-babelfish"

RDEPENDS:${PN} += "python-abi"

inherit rpm
