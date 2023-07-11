SUMMARY = "Python library for Bugzilla"
DESCRIPTION = "This is a Python module that provides a Python-ish interface to \
Bugzilla over XMLRPC. It supports the Web Services provided by \
upstream Bugzilla 3.0 and 3.2. \
 \
It also includes a 'bugzilla' commandline client which can be used for quick, \
ad-hoc bugzilla jiggery-pokery."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python310-bugzilla-3.2.0-1.6.noarch.rpm"
RPM_HASH = "3e27681dd273f6b98d7038a95f95f6cc687c1ee92205724807454410a3ec98d03c55b6950d8d6ffb0b8c9da428285e7642ea44dfc943125758873eb0f17a54d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-bugzilla \
python310-bugzilla \
python3dist-python-bugzilla"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-requests \
update-alternatives"

inherit rpm
