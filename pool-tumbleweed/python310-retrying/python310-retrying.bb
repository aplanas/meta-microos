SUMMARY = "Retrying library for Python"
DESCRIPTION = "Retrying is a general-purpose retrying library, written in Python, to \
simplify the task of adding retry behavior to just about anything."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "python310-retrying-1.3.4-1.3.noarch.rpm"
RPM_HASH = "57e62ebbabb843848a4b4b8e4bc31b7bb60f9dc0e5c201aea9836c14ef653d5da16a3dad3b65dafe2581c29cff2240be60549f6eecda0d47fccf8c598aa1d321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retrying \
python3.10dist(retrying) \
python310-retrying \
python3dist(retrying)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
