SUMMARY = "Module to configure apps using environment variables"
DESCRIPTION = "Environmental Override offers setting configuration values from \
environment variables."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-environmental-override-0.1.2-1.18.noarch.rpm"
RPM_HASH = "cb60ac3cba9afb062e7ff21822c94492061e0bbfc9f4cad36eacf49f577e2971d570be30117437bbe0f5e70f67e6e90a533968fce877ee9c31ec5063408c13a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-environmental-override \
python39-environmental-override \
python3dist-environmental-override"

RDEPENDS:${PN} += "python-abi"

inherit rpm
