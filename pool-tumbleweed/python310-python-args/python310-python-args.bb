SUMMARY = "Python argument design patterns in a composable interface"
DESCRIPTION = "Python argument design patterns in a composable interface."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python310-python-args-1.0.2-1.11.noarch.rpm"
RPM_HASH = "b9eadaf42f8621f1b08a8fb72a25236771c5364f3dc75d711efc17eaa9eb6ecdc6de3c2358c830a50d3c4a8724b56659f23577320994ea7361301745b6b1fcf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-args \
python3.10dist-python-args \
python310-python-args \
python3dist-python-args"

RDEPENDS:${PN} += "python-abi"

inherit rpm
