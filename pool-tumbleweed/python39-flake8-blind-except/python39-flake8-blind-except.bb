SUMMARY = "A flake8 extension that checks for blind except: statements"
DESCRIPTION = "A flake8 extension that checks for blind except: statements"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-flake8-blind-except-0.2.1-1.3.noarch.rpm"
RPM_HASH = "7c859c0fdb492504cba1f7b399897533ccf7595cb503b7b9b5f4b4b5185aee6b46516afe2c22a41973d2f2d9306563eb4a7eb5c216e77166f82cee12b163caec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-blind-except) \
python39-flake8-blind-except \
python3dist(flake8-blind-except)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
