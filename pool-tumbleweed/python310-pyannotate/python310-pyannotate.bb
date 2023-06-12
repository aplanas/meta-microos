SUMMARY = "PyAnnotate: Auto-generate PEP-484 annotations"
DESCRIPTION = "This module inserts annotations into source code based on call \
arguments and return types observed at runtime."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-pyannotate-1.2.0-4.4.noarch.rpm"
RPM_HASH = "dc4d93de7998d03412699a124d917814a8db7df88e66e77070654d20deff0aa8832d2b9078a40d2bb30db3aef88e317fd3f900b44c5298802c7af79bb204c543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyannotate \
python3.10dist(pyannotate) \
python310-pyannotate \
python3dist(pyannotate)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-mypy_extensions \
python310-six \
python310-typing \
update-alternatives"

inherit rpm
