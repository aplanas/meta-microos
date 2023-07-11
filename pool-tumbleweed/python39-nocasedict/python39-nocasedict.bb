SUMMARY = "A case-insensitive ordered dictionary for Python"
DESCRIPTION = "Class `NocaseDict`_ is a case-insensitive ordered dictionary that preserves \
the original lexical case of its keys."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "python39-nocasedict-1.0.4-1.5.noarch.rpm"
RPM_HASH = "499ac89203fe060a2f15d07a2aad92b4162f66a18a3618f365f4bef35fcd42222d81c552453cae25392e45bc4f1c5254501ec91318e86713111a22814ca27fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nocasedict \
python39-nocasedict \
python3dist-nocasedict"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
