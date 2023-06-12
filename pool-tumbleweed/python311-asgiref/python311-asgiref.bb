SUMMARY = "ASGI specs, helper code, and adapters"
DESCRIPTION = "ASGI is a standard for Python asynchronous web apps and servers to communicate \
with each other, and positioned as an asynchronous successor to WSGI. You can \
read more at https://asgi.readthedocs.io/en/latest/"
LICENSE = "BSD-3-Clause"

PV = "3.6.0"

RPM_NAME = "python311-asgiref-3.6.0-2.1.noarch.rpm"
RPM_HASH = "234636fd81c588c3cb1994d3fb84d76f2573a9c2426244f19f29f97c7d04f99c7503017fe40d68aee17256ef903d4e006510e3e52327668029ce7f7d6228544c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asgiref) \
python311-asgiref \
python3dist(asgiref)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
