SUMMARY = "Python bindings for taskwarrior"
DESCRIPTION = "Python bindings for your taskwarrior database."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python39-taskw-2.0.0-1.5.noarch.rpm"
RPM_HASH = "67e76b8dffed18161d6d1c5e4eb615919b0c252088869d199cf3a0a6324d23da4f59ed8071e641833235ee74c95a327b72e8d1a26b2b8cd149221de9e55ab5bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-taskw \
python39-taskw \
python3dist-taskw"

RDEPENDS:${PN} += "python-abi \
python39-kitchen \
python39-python-dateutil \
python39-pytz \
taskwarrior"

inherit rpm
