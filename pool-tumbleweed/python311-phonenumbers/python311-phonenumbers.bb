SUMMARY = "Python version of Google's common library for international phone numbers"
DESCRIPTION = "Python version of Google's common library for parsing, formatting, storing \
and validating international phone numbers."
LICENSE = "Apache-2.0"

PV = "8.13.18"

RPM_NAME = "python311-phonenumbers-8.13.18-1.1.noarch.rpm"
RPM_HASH = "4bc0fddbbef68aed08767d70a4a26acfaccab2a8f0a793d36f37cca86ea3a6d7aa273399ce7535411a636d460f98b4b9ea0971897e981af6c9c5156ab87bfbfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phonenumbers \
python3-phonenumberslite \
python3.11dist-phonenumbers \
python311-phonenumbers \
python311-phonenumberslite \
python3dist-phonenumbers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
