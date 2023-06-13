SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Red Hat Openshift Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-azure-mgmt-redhatopenshift-1.2.0-1.3.noarch.rpm"
RPM_HASH = "6d7f28a3b604e51f8b925bd73b353c9827f6bc53489f2a2c953a45934474ff15480a590bf50c228a8e87c721b40ad5d6c734ca09f4c5ac4824cc1bb1648343de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-redhatopenshift) \
python39-azure-mgmt-redhatopenshift \
python3dist(azure-mgmt-redhatopenshift)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
