SUMMARY = "Pytest plugin for printing summary data as I want it"
DESCRIPTION = "Opinionated pytest plugin to make output slightly easier to read \
and errors easy to find and fix."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-pytest-pretty-1.2.0-1.3.noarch.rpm"
RPM_HASH = "06c94c8054dab7edad5f63d9763f49248ee9a9e2dc0845d5f1668c3c1e6f6d40dab7adea89e3ec063351b7734fd7cc88053865ae6d4daa0ff79e4cb3fc01de0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-pretty \
python3.11dist-pytest-pretty \
python311-pytest-pretty \
python3dist-pytest-pretty"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-rich"

inherit rpm
