SUMMARY = "Pluggable object copying mechanism"
DESCRIPTION = "This package provides a pluggable mechanism for copying persistent objects. \
 \
Documentation is hosted at https://zopecopy.readthedocs.io/en/latest/"
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python39-zope.copy-4.3-2.2.noarch.rpm"
RPM_HASH = "449fe571d5ccdd7a448b3ba51caf00fc104b04b16292212a148beb82b76578bca7f213afe7292e6f106016297f22a96a07dcf2fc89a14d5bb46e195ee5b0227f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.copy \
python39-zope.copy \
python3dist-zope.copy"

RDEPENDS:${PN} += "python-abi \
python39-zope.interface"

inherit rpm
