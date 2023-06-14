SUMMARY = "Python library for Bugzilla"
DESCRIPTION = "This is a Python module that provides a Python-ish interface to \
Bugzilla over XMLRPC. It supports the Web Services provided by \
upstream Bugzilla 3.0 and 3.2. \
 \
It also includes a 'bugzilla' commandline client which can be used for quick, \
ad-hoc bugzilla jiggery-pokery."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python39-bugzilla-3.2.0-1.4.noarch.rpm"
RPM_HASH = "de8e81e7c20b1065a9db7667d7ef6d16996c962362f42329a1f38b2ea7cc1e514abd96571debe4da231966d96f00967885818fb08165705fb41419741dbea547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-bugzilla \
python39-bugzilla \
python3dist-python-bugzilla"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-requests \
update-alternatives"

inherit rpm
