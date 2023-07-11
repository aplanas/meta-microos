SUMMARY = "Zope testrunner script"
DESCRIPTION = "This package provides a flexible test runner with layer support."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python311-zope.testrunner-6.0-2.3.noarch.rpm"
RPM_HASH = "3837ae58d9d412b6985efdb8e484d50a8102da03ecd70ebdb2abff944e595b2b1477f1e3942f3f02138dd659014765b61982b106d1e5384c1043c1d722138ffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.testrunner \
python3.11dist-zope.testrunner \
python311-zope.testrunner \
python3dist-zope.testrunner"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-zope.exceptions \
python311-zope.interface \
update-alternatives"

inherit rpm
