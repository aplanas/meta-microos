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

RPM_NAME = "python39-pyOpenSSL-23.2.0-1.1.noarch.rpm"
RPM_HASH = "0f88e4a3497e19b34ed8871796c3a3e701563c14455cc46d949156068088a786e3a0113d64ff37fcaaf452f57f52706933cf75ccbc87df114cdb4a078f65769b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyOpenSSL \
python3.9dist-pyopenssl \
python39-pyOpenSSL \
python3dist-pyopenssl"

RDEPENDS:${PN} += "-python39-cryptography >= 38.0.0 with python39-cryptography < 42 \
python-abi \
python39-cffi"

inherit rpm
