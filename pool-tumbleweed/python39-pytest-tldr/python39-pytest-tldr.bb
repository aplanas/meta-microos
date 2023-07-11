SUMMARY = "A pytest plugin that limits the output to just the things you need"
DESCRIPTION = "A pytest plugin that limits the output to just the things you need."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "python39-pytest-tldr-0.2.5-1.5.noarch.rpm"
RPM_HASH = "899f4896d37f32352ef4149a176aa1c5bf79f738f79a532c4657fc32d06071491b13f649b352e227e6d423b0d5dd94f4a0672d55c6e9d6baee2a52de8dac1756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-tldr \
python39-pytest-tldr \
python3dist-pytest-tldr"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
