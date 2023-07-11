SUMMARY = "OpenCensus Azure Monitor Exporters"
DESCRIPTION = "OpenCensus Azure Monitor Exporters"
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "python39-opencensus-ext-azure-1.1.6-1.5.noarch.rpm"
RPM_HASH = "6b331f4f84004aefde60db3b3d2cd56be18d4f15c9d2e677c276d301267d575bcca3ec2c8cb20a84c5d76c4572c2299e7e92ebab45f9a24f0ce0dd87fd184a20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opencensus-ext-azure \
python39-opencensus-ext-azure \
python3dist-opencensus-ext-azure"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-identity \
python39-opencensus \
python39-psutil \
python39-requests"

inherit rpm
