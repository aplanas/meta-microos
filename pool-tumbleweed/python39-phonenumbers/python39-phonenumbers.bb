SUMMARY = "Python version of Google's common library for international phone numbers"
DESCRIPTION = "Python version of Google's common library for parsing, formatting, storing \
and validating international phone numbers."
LICENSE = "Apache-2.0"

PV = "8.13.18"

RPM_NAME = "python39-phonenumbers-8.13.18-1.1.noarch.rpm"
RPM_HASH = "5e9c8bcbbcd42527a2eee043d53f718a527931dd8ec9acd579ff88258d24260fd578cf82ad9f492b12f53748aa42d7e111d05f105fcf5cac73f48d6acfa7d187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-phonenumbers \
python39-phonenumbers \
python39-phonenumberslite \
python3dist-phonenumbers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
