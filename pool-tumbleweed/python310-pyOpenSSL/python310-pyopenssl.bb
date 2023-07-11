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

RPM_NAME = "python310-pyOpenSSL-23.2.0-1.1.noarch.rpm"
RPM_HASH = "ad7bdab676873e17eaae85b35d47b6c7db6c9cb2768d1141b57219c1016513d01e8fa509a12bd9a7b0d8d8fbab496b6b4a1a1639b43799ead58a6319e7eff162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyOpenSSL \
python3.10dist-pyopenssl \
python310-pyOpenSSL \
python3dist-pyopenssl"

RDEPENDS:${PN} += "-python310-cryptography >= 38.0.0 with python310-cryptography < 42 \
python-abi \
python310-cffi"

inherit rpm
