SUMMARY = "Python wrapper module around the OpenSSL library"
DESCRIPTION = "pyOpenSSL is a set of Python bindings for OpenSSL.  It includes some low-level \
cryptography APIs but is primarily focused on providing an API for using the \
TLS protocol from Python. \
 \
pyOpenSSL is now a pure-Python project with a dependency on a new project, \
cryptography (<https://github.com/pyca/cryptography>), which provides (among \
other things) a cffi-based interface to OpenSSL."
LICENSE = "Apache-2.0"

PV = "23.1.1"

RPM_NAME = "python311-pyOpenSSL-23.1.1-2.1.noarch.rpm"
RPM_HASH = "ad54945dbf462e2ad66e604d076bf7aa8aeae4c14f79611e00a80292dc2f5d20d06b2113f4cc2b63c4f8db8fa996477a406a3220be18d732ce6db26495a1c8a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyOpenSSL \
python3.11dist(pyopenssl) \
python311-pyOpenSSL \
python3dist(pyopenssl)"
RDEPENDS:${PN} += "(python311-cryptography >= 38.0.0 with python311-cryptography < 41) \
python(abi) \
python311-cffi"

inherit rpm
