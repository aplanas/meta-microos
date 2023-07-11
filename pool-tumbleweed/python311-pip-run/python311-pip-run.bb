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

RPM_NAME = "python311-pip-run-8.8.2-2.3.noarch.rpm"
RPM_HASH = "70b666d6cabcf7b0ecea30fae55b19524dd90e6d7f89035a154beb166e0ac825b1973ca573765c7de0dbe7486bac532081df78e23f63fb860cda2621f4e32a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-run \
python3.11dist-pip-run \
python311-pip-run \
python3dist-pip-run"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-autocommand \
python311-packaging \
python311-path \
python311-pip \
update-alternatives"

inherit rpm
