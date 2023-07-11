SUMMARY = "ASGI specs, helper code, and adapters"
DESCRIPTION = "ASGI is a standard for Python asynchronous web apps and servers to communicate \
with each other, and positioned as an asynchronous successor to WSGI. You can \
read more at https://asgi.readthedocs.io/en/latest/"
LICENSE = "BSD-3-Clause"

PV = "3.6.0"

RPM_NAME = "python39-asgiref-3.6.0-2.3.noarch.rpm"
RPM_HASH = "c30db4a6601ddd26fbec840f05901ff77b7c1ad9336b5c053814c26a1eab957846d8cf1a41620891351d3edceff3b0a9ffb2f0d8eeba509b4d13ac635640a5bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asgiref \
python39-asgiref \
python3dist-asgiref"

RDEPENDS:${PN} += "python-abi"

inherit rpm
