SUMMARY = "Python library for Bugzilla"
DESCRIPTION = "This is a Python module that provides a Python-ish interface to \
Bugzilla over XMLRPC. It supports the Web Services provided by \
upstream Bugzilla 3.0 and 3.2. \
 \
It also includes a 'bugzilla' commandline client which can be used for quick, \
ad-hoc bugzilla jiggery-pokery."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python311-bugzilla-3.2.0-1.6.noarch.rpm"
RPM_HASH = "3b50a92bb93fbdf9e6475949a7dc48cf7b5fa516f4a22ba3c588879845bb8811454d76bb5967a09a29e23e8f9b5eb4a7f41174aef74449c66bce40fb3e079171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bugzilla \
python3.11dist-python-bugzilla \
python311-bugzilla \
python3dist-python-bugzilla"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-requests \
update-alternatives"

inherit rpm
