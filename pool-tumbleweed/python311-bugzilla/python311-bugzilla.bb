SUMMARY = "Python library for Bugzilla"
DESCRIPTION = "This is a Python module that provides a Python-ish interface to \
Bugzilla over XMLRPC. It supports the Web Services provided by \
upstream Bugzilla 3.0 and 3.2. \
 \
It also includes a 'bugzilla' commandline client which can be used for quick, \
ad-hoc bugzilla jiggery-pokery."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python311-bugzilla-3.2.0-1.4.noarch.rpm"
RPM_HASH = "404bccde3adf0c87e182977351696b064c6965acf665c10b70e89ac49df19020b6dd9b8cbe583e52d113e101ac06fc1b6a31f1a9cba2ce43da08cf0b9834ad18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-bugzilla \
python311-bugzilla \
python3dist-python-bugzilla"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-requests \
update-alternatives"

inherit rpm
