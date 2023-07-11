SUMMARY = "Localization library for expressive translations"
DESCRIPTION = "A localization framework for natural language translations."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python311-fluent-0.10.0-3.13.noarch.rpm"
RPM_HASH = "b6f9206ac8f57a6cc9c5694c20a8e962402410b61b64b554e81eb9810cbfaae2901616b16569760495d923a3320083c6c56955bf11cae2ef81ce459a146c5c7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fluent \
python3.11dist-fluent \
python311-fluent \
python3dist-fluent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
