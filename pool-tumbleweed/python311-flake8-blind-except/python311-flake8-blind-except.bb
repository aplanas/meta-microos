SUMMARY = "A flake8 extension that checks for blind except: statements"
DESCRIPTION = "A flake8 extension that checks for blind except: statements"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-flake8-blind-except-0.2.1-1.4.noarch.rpm"
RPM_HASH = "a0b90521eba92e1b2509137b4de85cfe86316345b6c4ae0360d3576a60143e77f5493a5814621c8b68f85525e0cd65e67a6b35dc0155350a0197246a35abc3e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-blind-except \
python3.11dist-flake8-blind-except \
python311-flake8-blind-except \
python3dist-flake8-blind-except"

RDEPENDS:${PN} += "python-abi"

inherit rpm
