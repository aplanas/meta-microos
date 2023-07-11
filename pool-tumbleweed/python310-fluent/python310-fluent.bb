SUMMARY = "Localization library for expressive translations"
DESCRIPTION = "A localization framework for natural language translations."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python310-fluent-0.10.0-3.13.noarch.rpm"
RPM_HASH = "ac6cf527688623d2b39c2b7e377d01e4d3a6a220af4d0a809b6882c984f6579f1b9b88a8c227e86d8b272a6e0408adc76f2160d3493b979af880052722864e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fluent \
python310-fluent \
python3dist-fluent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
