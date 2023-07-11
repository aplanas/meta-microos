SUMMARY = "Helper to build testable command line interfaces"
DESCRIPTION = "CliKit is a group of utilities to build beautiful and testable \
command line interfaces."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-clikit-0.6.2-3.1.noarch.rpm"
RPM_HASH = "eb114c910a3dd27efcc628800133c23cc5c852175759ebc094ca2fca77c4f7a1c82eca2ee7f0053d8e407989519cd6a9da3c2d175b117b9a6fe97cf8e0c04f49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-clikit \
python39-clikit \
python3dist-clikit"

RDEPENDS:${PN} += "python-abi \
python39-crashtest \
python39-pastel \
python39-pylev"

inherit rpm
