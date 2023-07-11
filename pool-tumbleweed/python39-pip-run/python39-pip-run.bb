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

RPM_NAME = "python39-pip-run-8.8.2-2.3.noarch.rpm"
RPM_HASH = "59b6e000e4659c2b42999f86a1586aaaa84a16bdf42c4874747ec6a149a1b8203d7fa496b2dd4f0d10b825e35c6d7465ef307ac65a065bc82773f04e47b747f3"
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
