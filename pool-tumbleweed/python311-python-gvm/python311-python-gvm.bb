SUMMARY = "Library to communicate with remote servers over GMP or OSP"
DESCRIPTION = "The Greenbone Vulnerability Management Python API library python-gvm is a \
collection of APIs that help with remote controlling a Greenbone Security \
Manager (GSM) appliance and its underlying Greenbone Vulnerability Manager \
(GVM). The library essentially abstracts accessing the communication protocols \
Greenbone Management Protocol (GMP) and Open Scanner Protocol (OSP)."
LICENSE = "GPL-3.0-only"

PV = "23.5.0"

RPM_NAME = "python311-python-gvm-23.5.0-1.1.noarch.rpm"
RPM_HASH = "a091d12bff8e5efeff220af6910d6de86c109c0d5c93ba7d33ee39b02d6f5aced9c0e17b1cf5a116a7ca2dc505214b7150ba898cc15323db98493fcab769d765"
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
