SUMMARY = "A flake8 extension that checks for blind except: statements"
DESCRIPTION = "A flake8 extension that checks for blind except: statements"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-flake8-blind-except-0.2.1-1.3.noarch.rpm"
RPM_HASH = "cb3be64d0f5211b94bda4f5a9e0ed010ea22bfebb1481e5e0935aecdd945d8206e6af2e9d9de3d3b5e095d853aca0b1f2ec46e1694e1f2a972237bbb03fd612d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-blind-except \
python3.10dist(flake8-blind-except) \
python310-flake8-blind-except \
python3dist(flake8-blind-except)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
