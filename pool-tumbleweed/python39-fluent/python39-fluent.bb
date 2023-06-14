SUMMARY = "Localization library for expressive translations"
DESCRIPTION = "A localization framework for natural language translations."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python39-fluent-0.10.0-3.11.noarch.rpm"
RPM_HASH = "1828259e9abc878c5606bf1ad00c4376b3549732942ab56b7e19112b7107f70b3aa5c7bd6a8b4e36132e1f8c15e654fbc7576d99a31a1ab69b14568ab2f57d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fluent \
python39-fluent \
python3dist-fluent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
