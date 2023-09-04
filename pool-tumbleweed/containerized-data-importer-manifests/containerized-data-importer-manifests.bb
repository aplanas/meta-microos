SUMMARY = "YAML manifests used to install CDI"
DESCRIPTION = "This contains the built YAML manifests used to install CDI into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "containerized-data-importer-manifests-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "3d848726b5bcc7b852f5e191286b0e75aa242f0ea13a9fe132798c5dcdce8a3e59dc6ffec87c18b975f00c584e7b15f07ba14811251812c75faa4162c1a21984"

RPROVIDES:${PN} += "containerized-data-importer-manifests"

RDEPENDS:${PN} += ""

inherit rpm
