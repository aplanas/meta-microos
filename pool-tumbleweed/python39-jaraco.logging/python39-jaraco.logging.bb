SUMMARY = "Tools to work with logging"
DESCRIPTION = "jaraco.logging Tools for working with logging."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "python39-jaraco.logging-3.1.2-2.1.noarch.rpm"
RPM_HASH = "e8e59467b31657adb12c6dd31ce49006cc4e115d471500c88d8e3715b8091be1e60a5965554d39977766d7573870077945212d91e7ea9cd73880513e4e1565bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.logging \
python39-jaraco.logging \
python3dist-jaraco.logging"

RDEPENDS:${PN} += "python-abi \
python39-tempora"

inherit rpm
