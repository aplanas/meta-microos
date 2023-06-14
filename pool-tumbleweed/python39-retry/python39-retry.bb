SUMMARY = "Python retry decorator"
DESCRIPTION = "Easy to use retry decorator."
LICENSE = "Apache-2.0"

PV = "0.9.2"

RPM_NAME = "python39-retry-0.9.2-3.6.noarch.rpm"
RPM_HASH = "0abb9c8f7990f2aecd4e76593de68f8cf5077c1b50faca7cfc3e7559ee7bd5a56db98b8111b7ee025d297be3c2dafa3d976e5cf549a6af02c0a0a1106bbbe444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-retry \
python39-retry \
python3dist-retry"

RDEPENDS:${PN} += "python-abi \
python39-decorator \
python39-py"

inherit rpm
