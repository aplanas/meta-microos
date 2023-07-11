SUMMARY = "Run each test in a forked subprocess"
DESCRIPTION = "Extraction of pytest-xdist --forked module used for running tests in forked subprocess"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-pytest-forked-1.6.0-2.3.noarch.rpm"
RPM_HASH = "0d0a613c341f6f7e3e9aa82cd506d27d9a05defe89f9bd9cf39f3d447659d30840cc2fdfd3542d2609757650472d99c4408e6303199423cdae4e3ad1ef3fe1cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-forked \
python3.11dist-pytest-forked \
python311-pytest-forked \
python3dist-pytest-forked"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pytest"

inherit rpm
