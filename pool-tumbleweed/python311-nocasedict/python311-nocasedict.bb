SUMMARY = "A case-insensitive ordered dictionary for Python"
DESCRIPTION = "Class `NocaseDict`_ is a case-insensitive ordered dictionary that preserves \
the original lexical case of its keys."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "python311-nocasedict-1.0.4-1.5.noarch.rpm"
RPM_HASH = "718a1a08e6efff7e59ba332bc15513651b03e9109a3209e1c2cc90d1cbec04255e31871858aa33843f675865f32f7e54390b01c677f11b62baae0eadd36770ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nocasedict \
python3.11dist-nocasedict \
python311-nocasedict \
python3dist-nocasedict"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
