SUMMARY = "Python argument design patterns in a composable interface"
DESCRIPTION = "Python argument design patterns in a composable interface."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python310-python-args-1.0.2-1.13.noarch.rpm"
RPM_HASH = "9c82abb74b20f1b443c40873a520784cdecd9f210b31015f44fecfdb342b08392232e4873cc48a3d720247e28d222b56497e6bc2b5ae04effbc8af29ae31270e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-args \
python310-python-args \
python3dist-python-args"

RDEPENDS:${PN} += "python-abi"

inherit rpm
