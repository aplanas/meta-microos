SUMMARY = "A flake8 extension that checks for blind except: statements"
DESCRIPTION = "A flake8 extension that checks for blind except: statements"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-flake8-blind-except-0.2.1-1.4.noarch.rpm"
RPM_HASH = "df88de5a2f86f816ab34d0758131ff4bb6c974559965ea4be06dcc3221e61e16364af756ba8e7476be06ae31f1b0f848475f1a90e51530dd094800915f1bbb22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-blind-except \
python39-flake8-blind-except \
python3dist-flake8-blind-except"

RDEPENDS:${PN} += "python-abi"

inherit rpm
