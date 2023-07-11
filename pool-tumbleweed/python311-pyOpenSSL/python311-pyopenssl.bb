SUMMARY = "Python wrapper module around the OpenSSL library"
DESCRIPTION = "pyOpenSSL is a set of Python bindings for OpenSSL.  It includes some low-level \
cryptography APIs but is primarily focused on providing an API for using the \
TLS protocol from Python. \
 \
pyOpenSSL is now a pure-Python project with a dependency on a new project, \
cryptography (<https://github.com/pyca/cryptography>), which provides (among \
other things) a cffi-based interface to OpenSSL."
LICENSE = "Apache-2.0"

PV = "23.2.0"

RPM_NAME = "python311-pyOpenSSL-23.2.0-1.1.noarch.rpm"
RPM_HASH = "656ad83e5d82f5a948103d53bfe7be35b0912c35945cbd4c3a042211410bd817366a5275e987257a768a1ab8d36eb322ff071c4f959f6b61d3c892227f527cb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyOpenSSL \
python3-pyOpenSSL \
python3.11dist-pyopenssl \
python311-pyOpenSSL \
python3dist-pyopenssl"

RDEPENDS:${PN} += "-python311-cryptography >= 38.0.0 with python311-cryptography < 42 \
python-abi \
python311-cffi"

inherit rpm
