SUMMARY = "Avocado Runner for Remote Execution"
DESCRIPTION = "This plugin allows Avocado to run jobs on a remote machine, by means of an SSH \
connection. Avocado must have been previously installed on the remote machine."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-runner-remote-69.0-6.11.noarch.rpm"
RPM_HASH = "41a9a3eb165a0d50380017473a228cacfad5fc62dfe1d01ee0fe7a4952fb56cbe01e43488a003af84b0a9036c7014fa566ffe6281b214e4fd019545203d21b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-runner-remote \
python3.11dist-avocado-framework-plugin-runner-remote \
python3dist-avocado-framework-plugin-runner-remote"

RDEPENDS:${PN} += "python-abi \
python3-Fabric \
python3-avocado"

inherit rpm
