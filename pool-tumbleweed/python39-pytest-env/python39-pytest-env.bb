SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python39-pytest-env-0.8.1-1.1.noarch.rpm"
RPM_HASH = "2e98c7c7e0ad6e3c272c56950d3c32d0f8733a158d5b7b0df2174ecd621bd123668cbe18e2c09c11e50a14187ae2b5e38077db480e3fcf91d8b0914faa213818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-env \
python39-pytest-env \
python3dist-pytest-env"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
