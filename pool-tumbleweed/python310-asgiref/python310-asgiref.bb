SUMMARY = "ASGI specs, helper code, and adapters"
DESCRIPTION = "ASGI is a standard for Python asynchronous web apps and servers to communicate \
with each other, and positioned as an asynchronous successor to WSGI. You can \
read more at https://asgi.readthedocs.io/en/latest/"
LICENSE = "BSD-3-Clause"

PV = "3.6.0"

RPM_NAME = "python310-asgiref-3.6.0-2.3.noarch.rpm"
RPM_HASH = "11b864412375d493485eae59ba2667ac4a8df275a8f53da7ca3facc55f395b0300d2e387c6337571625b7e2b7c76299ce346748006e29903594c1f5490490718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asgiref \
python310-asgiref \
python3dist-asgiref"

RDEPENDS:${PN} += "python-abi"

inherit rpm
