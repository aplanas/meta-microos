SUMMARY = "Avocado Runner for Remote Execution"
DESCRIPTION = "This plugin allows Avocado to run jobs on a remote machine, by means of an SSH \
connection. Avocado must have been previously installed on the remote machine."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-runner-remote-69.0-6.10.noarch.rpm"
RPM_HASH = "10d41d30576fb61dd8a13fbab8399d13ece93991f051be1b0ac26e4643a87a797949ca032afa0efee915a98bf5f98d356e99cfe493cdb9e791caa34aa79071ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-runner-remote \
python3.10dist-avocado-framework-plugin-runner-remote \
python3dist-avocado-framework-plugin-runner-remote"

RDEPENDS:${PN} += "python-abi \
python3-Fabric \
python3-avocado"

inherit rpm
