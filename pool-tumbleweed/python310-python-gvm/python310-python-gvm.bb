SUMMARY = "Library to communicate with remote servers over GMP or OSP"
DESCRIPTION = "The Greenbone Vulnerability Management Python API library python-gvm is a \
collection of APIs that help with remote controlling a Greenbone Security \
Manager (GSM) appliance and its underlying Greenbone Vulnerability Manager \
(GVM). The library essentially abstracts accessing the communication protocols \
Greenbone Management Protocol (GMP) and Open Scanner Protocol (OSP)."
LICENSE = "GPL-3.0-only"

PV = "23.5.0"

RPM_NAME = "python310-python-gvm-23.5.0-1.1.noarch.rpm"
RPM_HASH = "a0740740c4d6da0f82f10b9bad516589e97ba7bd86eec5bf27ce9ecb27b30c855078655930c00c6c382ac279650147424995f3ce5f06628e25e82070e95566d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-gvm \
python310-python-gvm \
python3dist-python-gvm"

RDEPENDS:${PN} += "python-abi \
python310-defusedxml \
python310-lxml \
python310-paramiko"

inherit rpm
