SUMMARY = "Library to communicate with remote servers over GMP or OSP"
DESCRIPTION = "The Greenbone Vulnerability Management Python API library python-gvm is a \
collection of APIs that help with remote controlling a Greenbone Security \
Manager (GSM) appliance and its underlying Greenbone Vulnerability Manager \
(GVM). The library essentially abstracts accessing the communication protocols \
Greenbone Management Protocol (GMP) and Open Scanner Protocol (OSP)."
LICENSE = "GPL-3.0-only"

PV = "23.2.0"

RPM_NAME = "python310-python-gvm-23.2.0-1.4.noarch.rpm"
RPM_HASH = "819d709b82938a65e1f566ec519bf3aab8a668f9ba118099af60e5eeb479dc8c331aa08829bdf340a544721cb4ce8bd61a71892f9f749f0dd8af818a2d7c4f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-gvm \
python310-python-gvm \
python3dist-python-gvm"

RDEPENDS:${PN} += "python-abi \
python310-defusedxml \
python310-lxml \
python310-paramiko"

inherit rpm
