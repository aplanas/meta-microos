SUMMARY = "Additional scripts in python"
DESCRIPTION = "Additional scripts for the use of openQA in the python programming language."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690803816.e47aebd"

RPM_NAME = "openQA-python-scripts-4.6.1690803816.e47aebd-1.1.aarch64.rpm"
RPM_HASH = "33f00cad32cfc08d0c3426fa3ce19904ce86cf394517d174b5753d12899d84b3a00b67323965eabf54020c31889faeb1c7b71a8c2fe34ea7d44126261a35f790"

RPROVIDES:${PN} += "openQA-python-scripts"

RDEPENDS:${PN} += "/usr/bin/python3 \
openQA-client \
python3-base \
python3-requests"

inherit rpm
