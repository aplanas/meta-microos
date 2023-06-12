SUMMARY = "ASGI specs, helper code, and adapters"
DESCRIPTION = "ASGI is a standard for Python asynchronous web apps and servers to communicate \
with each other, and positioned as an asynchronous successor to WSGI. You can \
read more at https://asgi.readthedocs.io/en/latest/"
LICENSE = "BSD-3-Clause"

PV = "3.6.0"

RPM_NAME = "python310-asgiref-3.6.0-2.1.noarch.rpm"
RPM_HASH = "bebb643768cea7cfb130985989ae4e6a4c3178cd6027e6808df24f5e0eaaccbed3b9889ac58b4939cdf23a0a520289a37504e89a70670ab7483b808ccfde7439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asgiref \
python3.10dist(asgiref) \
python310-asgiref \
python3dist(asgiref)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
