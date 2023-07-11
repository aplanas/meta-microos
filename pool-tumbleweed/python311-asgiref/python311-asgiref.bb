SUMMARY = "ASGI specs, helper code, and adapters"
DESCRIPTION = "ASGI is a standard for Python asynchronous web apps and servers to communicate \
with each other, and positioned as an asynchronous successor to WSGI. You can \
read more at https://asgi.readthedocs.io/en/latest/"
LICENSE = "BSD-3-Clause"

PV = "3.6.0"

RPM_NAME = "python311-asgiref-3.6.0-2.3.noarch.rpm"
RPM_HASH = "a80ba2f51e1995a345abc48d65685a8c68555b7cf7593c215bddb8accb8b44b341a8f824345039eea1073ad28c14fa15772ecb8fc08589c9e6a6dc69b94967b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asgiref \
python3.11dist-asgiref \
python311-asgiref \
python3dist-asgiref"

RDEPENDS:${PN} += "python-abi"

inherit rpm
