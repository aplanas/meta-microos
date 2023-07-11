SUMMARY = "Python bindings for Augeas"
DESCRIPTION = "Python bindings for Augeas, a library for programmatically editing \
configuration files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "python39-augeas-1.1.0-1.1.noarch.rpm"
RPM_HASH = "024e14af5139f50a3d8dbb0dce91890a1a4682460d327ce822b266463a42e049bbe107fb6456b9ef2566550f3ead6cc809fe9a1b9ed68f289b06bfc2bbe2ff8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-augeas \
python39-augeas \
python3dist-python-augeas"

RDEPENDS:${PN} += "augeas \
augeas-lenses \
python-abi"

inherit rpm
