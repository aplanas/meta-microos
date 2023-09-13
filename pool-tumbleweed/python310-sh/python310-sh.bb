SUMMARY = "Python subprocess interface"
DESCRIPTION = "sh is a full-fledged subprocess replacement for Python 2.6 - 3.6, PyPy \
and PyPy3 that allows you to call any program as if it were a \
function: \
 \
    from sh import ifconfig \
    print ifconfig('eth0') \
 \
sh is not a collection of system commands implemented in Python."
LICENSE = "MIT"

PV = "2.0.6"

RPM_NAME = "python310-sh-2.0.6-1.1.noarch.rpm"
RPM_HASH = "97a135fc6f8139cbffde4cafeedb0823c26ccf991e2140564e055294b3ffd8e93b67c7c72a738d0dc8239e8cfa9061eeb2af93b9866e23f683dccf978a0b17be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sh \
python310-sh \
python3dist-sh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
