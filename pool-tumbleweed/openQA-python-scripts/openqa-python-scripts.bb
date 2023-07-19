SUMMARY = "Additional scripts in python"
DESCRIPTION = "Additional scripts for the use of openQA in the python programming language."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689265095.7be7504"

RPM_NAME = "openQA-python-scripts-4.6.1689265095.7be7504-1.1.aarch64.rpm"
RPM_HASH = "d69f78b9aed368cb8cb61943806e4bcde3be82f689bc0d906aa6d0732b71c67ca24a3cb69bf92aebbeb499d2c3e29b9be43327ca92ba8a7eb0be1aecb618c289"

RPROVIDES:${PN} += "openQA-python-scripts"

RDEPENDS:${PN} += "/usr/bin/python3 \
openQA-client \
python3-base \
python3-requests"

inherit rpm
