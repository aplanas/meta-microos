SUMMARY = "A pytest plugin that parses environment files"
DESCRIPTION = "A py.test plugin that parses environment files before running tests."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python39-pytest-dotenv-0.5.2-1.12.noarch.rpm"
RPM_HASH = "5db71c0435d09773e46e502513a79a79e196274f42658a2d56d97795a39ad76f3281011cfc87008d7e6349d63d8b019a762fa5fab866a8c001b6be3de8deb3ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-dotenv) \
python39-pytest-dotenv \
python3dist(pytest-dotenv)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest \
python39-python-dotenv"

inherit rpm
