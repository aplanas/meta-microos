SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python39-ipyvue-1.9.2-1.2.noarch.rpm"
RPM_HASH = "afa26c7f45fc95ad8486d24125a340d3a7caa869249b73c99a0b5f9f5e7e40638b2a8068aec3f150a51ec39bfcc293fdbbcb08f68175390981cfa4a812c43a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyvue \
python39-ipyvue \
python3dist-ipyvue"

RDEPENDS:${PN} += "python-abi \
python39-ipywidgets"

inherit rpm
