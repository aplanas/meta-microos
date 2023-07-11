SUMMARY = "Python Module Implementing the ManageSieve Protocol"
DESCRIPTION = "python-managesieve is a Python module implementing the ManageSieve client \
protocol. It also includes an user application (the interactive sieveshell)."
LICENSE = "GPL-3.0-or-later & Python-2.0"

PV = "0.7.1"

RPM_NAME = "python39-managesieve-0.7.1-1.11.noarch.rpm"
RPM_HASH = "23528f702c29f4ddc99f4ad2e6a950f727bbb7ab1df6e22c07d442d5b704f6aa401526affad27b79f2be52432f80924609b0d09f079c534aa9e453c69f59e598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-managesieve \
python39-managesieve \
python3dist-managesieve"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
