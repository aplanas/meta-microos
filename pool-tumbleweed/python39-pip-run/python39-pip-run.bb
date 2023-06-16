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

RPM_NAME = "python39-pip-run-8.8.2-2.1.noarch.rpm"
RPM_HASH = "c4ff8879d270cde3a60774622d29b4bf3912fdb099a612719bc8c969f5ce45c5acaccd8eed7831474fbfee70d965f6bfb5c71956c367fa1620ea33e814d2678b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pip-run \
python39-pip-run \
python3dist-pip-run"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-autocommand \
python39-packaging \
python39-path \
python39-pip \
update-alternatives"

inherit rpm
