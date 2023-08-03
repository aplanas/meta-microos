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

RPM_NAME = "python310-gvm-tools-23.4.0-1.1.noarch.rpm"
RPM_HASH = "f7758399c681b55d6deea0f3ca175165802af2f34aaeb5c253a35bab477474160dcc67b95fa59da045da555d189b606d13865911be5b66e800aca4a014397c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gvm-tools \
python310-gvm-tools \
python3dist-gvm-tools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-python-gvm \
update-alternatives"

inherit rpm
