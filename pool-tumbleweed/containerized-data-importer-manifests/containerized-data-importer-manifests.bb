SUMMARY = "YAML manifests used to install CDI"
DESCRIPTION = "This contains the built YAML manifests used to install CDI into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-manifests-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "61d890ac7f2b4cd1515df14b40da6f754aa2f9714983b38c1acf8c4b59584978cb29eff8d0edde953d8a3faf312b14bb9c1c323951d84ee3c8e3bfb8f7a1264e"

RPROVIDES:${PN} += "containerized-data-importer-manifests"

RDEPENDS:${PN} += ""

inherit rpm
