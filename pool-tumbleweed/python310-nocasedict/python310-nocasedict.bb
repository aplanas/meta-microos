SUMMARY = "A case-insensitive ordered dictionary for Python"
DESCRIPTION = "Class `NocaseDict`_ is a case-insensitive ordered dictionary that preserves \
the original lexical case of its keys."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "python310-nocasedict-1.0.4-1.3.noarch.rpm"
RPM_HASH = "d82d15d3f6ff21e7e412499f0cd24558b8477a096cf51ffaad4e8e1d67d6c896f9ef0e8ccc15cb7273c9e30b621418370ab8b401a4cc2dc51720d62f5d9e8fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nocasedict \
python3.10dist-nocasedict \
python310-nocasedict \
python3dist-nocasedict"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
