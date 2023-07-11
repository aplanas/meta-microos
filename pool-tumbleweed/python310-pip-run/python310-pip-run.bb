SUMMARY = "Install packages and run Python with them"
DESCRIPTION = "On-demand temporary package installation for a single interpreter run. \
 \
pip-run is not intended to solve production dependency management, \
but does aim to address the other, one-off scenarios around dependency management \
  - trials and experiments \
  - build setup \
  - test runners \
  - just in time script running \
  - interactive development \
  - bug triage \
 \
pip-run is a compliment to Pip and Virtualenv and Setuptools, intended to more \
readily address the on-demand needs."
LICENSE = "MIT"

PV = "8.8.2"

RPM_NAME = "python310-pip-run-8.8.2-2.3.noarch.rpm"
RPM_HASH = "9169416d2c0e36cd97f87819fd77b56ababef5deaa9367e51b4e92ba3d289144c2cabc7f4f53bdb4d7ae2947630071125c23882a2d1e8f59a98d271abe287da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pip-run \
python310-pip-run \
python3dist-pip-run"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-autocommand \
python310-packaging \
python310-path \
python310-pip \
update-alternatives"

inherit rpm
