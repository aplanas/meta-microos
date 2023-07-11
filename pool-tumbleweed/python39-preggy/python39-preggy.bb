SUMMARY = "Assertion library for Python"
DESCRIPTION = "preggy is an assertion library for Python. (What were you ``expect()``ing?) \
Part of the pyVows test framework."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python39-preggy-1.4.4-2.14.noarch.rpm"
RPM_HASH = "9728c57aebf27b60ba8f5ec62856cd7eb0cd2fc8e42c2ffb18366d224077974d2d1ef05c8bff160f1662d255018132cd46567a43721b06a4af1cd0cdd2a4f926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-preggy \
python39-preggy \
python3dist-preggy"

RDEPENDS:${PN} += "python-abi \
python39-Unidecode \
python39-six"

inherit rpm
