SUMMARY = "Tools to control a GSM/GVM over GMP or OSP"
DESCRIPTION = "The Greenbone Vulnerability Management Tools gvm-tools are a collection \
of tools that help with remote controlling a Greenbone Security Manager \
(GSM) appliance and its underlying Greenbone Vulnerability Manager (GVM). \
The tools aid in accessing the communication protocols GMP (Greenbone \
Management Protocol) and OSP (Open Scanner Protocol). \
 \
This module is comprised of interactive and non-interactive clients. \
The programming language Python is supported directly for interactive \
scripting. But it is also possible to issue remote GMP/OSP commands \
without programming in Python."
LICENSE = "GPL-3.0-or-later"

PV = "23.4.0"

RPM_NAME = "python311-gvm-tools-23.4.0-1.1.noarch.rpm"
RPM_HASH = "16bcb885e4f9b658c88a64d7fbdeb8d97925243f41e99a400550fffdde2ad9d3b3e4391141e885bc9dbf6d725bbd256cc9d5849ed7f282ca56c7a76205669a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gvm-tools \
python3.11dist-gvm-tools \
python311-gvm-tools \
python3dist-gvm-tools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-python-gvm \
update-alternatives"

inherit rpm
