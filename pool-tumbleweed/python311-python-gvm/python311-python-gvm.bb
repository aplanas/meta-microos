SUMMARY = "Library to communicate with remote servers over GMP or OSP"
DESCRIPTION = "The Greenbone Vulnerability Management Python API library python-gvm is a \
collection of APIs that help with remote controlling a Greenbone Security \
Manager (GSM) appliance and its underlying Greenbone Vulnerability Manager \
(GVM). The library essentially abstracts accessing the communication protocols \
Greenbone Management Protocol (GMP) and Open Scanner Protocol (OSP)."
LICENSE = "GPL-3.0-only"

PV = "23.2.0"

RPM_NAME = "python311-python-gvm-23.2.0-1.2.noarch.rpm"
RPM_HASH = "e0cb834b66017de786547e615c7f2f206f58dc2a9139e870411553ae68997b9e602b6557ee96df07b30c1100a0984bd4b5be29f006b88d2032d5f22085762c28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-gvm) \
python311-python-gvm \
python3dist(python-gvm)"

RDEPENDS:${PN} += "python(abi) \
python311-defusedxml \
python311-lxml \
python311-paramiko"

inherit rpm
