SUMMARY = "Python version of Google's common library for international phone numbers"
DESCRIPTION = "Python version of Google's common library for parsing, formatting, storing \
and validating international phone numbers."
LICENSE = "Apache-2.0"

PV = "8.13.5"

RPM_NAME = "python310-phonenumbers-8.13.5-2.3.noarch.rpm"
RPM_HASH = "f99acb5be9da071b76a84a4c782171722f89d5afa1afb0c665f1ee3ff4b6f85634765d540a3bee1bc9f07afff27c57e9a2a1dc028d95b718e492a5bb425f2d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-phonenumbers \
python310-phonenumbers \
python310-phonenumberslite \
python3dist-phonenumbers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
