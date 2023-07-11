SUMMARY = "Library to communicate with remote servers over GMP or OSP"
DESCRIPTION = "The Greenbone Vulnerability Management Python API library python-gvm is a \
collection of APIs that help with remote controlling a Greenbone Security \
Manager (GSM) appliance and its underlying Greenbone Vulnerability Manager \
(GVM). The library essentially abstracts accessing the communication protocols \
Greenbone Management Protocol (GMP) and Open Scanner Protocol (OSP)."
LICENSE = "GPL-3.0-only"

PV = "23.2.0"

RPM_NAME = "python311-python-gvm-23.2.0-1.4.noarch.rpm"
RPM_HASH = "73410ec391cbd4899647da7cd875d11d7ff0d8f486d268d803b1da4e300bab53613844d70096d1939c814f00381c8ad806d0f6f9e69ca09a32d244744c96f507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-gvm \
python3.11dist-python-gvm \
python311-python-gvm \
python3dist-python-gvm"

RDEPENDS:${PN} += "python-abi \
python311-defusedxml \
python311-lxml \
python311-paramiko"

inherit rpm
