SUMMARY = "Pytest plugin to exit successfully when a required percent of tests pass"
DESCRIPTION = "Change the exit code of pytest test sessions when a required percent of tests pass."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-pytest-percent-0.1.2-1.12.noarch.rpm"
RPM_HASH = "b1ac0d656051d9242100007d6326200dd503b6319735e29ca0b086be69d8f4e1a566c3fbd45e3522222eaf17dc50d21fd4792bdd271663553be428c915eedb80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-percent \
python3.10dist(pytest-percent) \
python310-pytest-percent \
python3dist(pytest-percent)"

RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
