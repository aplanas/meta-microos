SUMMARY = "Python library for Bugzilla"
DESCRIPTION = "This is a Python module that provides a Python-ish interface to \
Bugzilla over XMLRPC. It supports the Web Services provided by \
upstream Bugzilla 3.0 and 3.2. \
 \
It also includes a 'bugzilla' commandline client which can be used for quick, \
ad-hoc bugzilla jiggery-pokery."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python39-bugzilla-3.2.0-1.6.noarch.rpm"
RPM_HASH = "32f39f17ccdbc42c73fe7f4e9759056e6afbd966899cd1779a9c2a76a19a26a2e9a64917dd6f59cb59fccf2df41ea4a4153308155631073900d8855c7df51f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-bugzilla \
python39-bugzilla \
python3dist-python-bugzilla"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-requests \
update-alternatives"

inherit rpm
