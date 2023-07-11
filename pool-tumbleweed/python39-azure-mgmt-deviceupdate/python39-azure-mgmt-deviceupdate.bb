SUMMARY = "Microsoft Azure Deviceupdate Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Deviceupdate Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-deviceupdate-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "53cb61000739267f87bbc382db7eb05344cf74a613e1a78231ab1eff23e1bfae7397d0f249eb49e4db432d875e445eee9469d66cb5708746114b31a38a8d772b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-deviceupdate \
python39-azure-mgmt-deviceupdate \
python3dist-azure-mgmt-deviceupdate"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
