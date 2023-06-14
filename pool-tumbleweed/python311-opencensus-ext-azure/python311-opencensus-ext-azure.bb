SUMMARY = "OpenCensus Azure Monitor Exporters"
DESCRIPTION = "OpenCensus Azure Monitor Exporters"
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "python311-opencensus-ext-azure-1.1.6-1.3.noarch.rpm"
RPM_HASH = "1297da1634a540cb84990ce3f584fcc939360878e814ae3b6480cf869d195a5e9f3eb28ba7cf468500e0eb1261169c07061f1e312bf058f71495ff2d9ff3f39c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-opencensus-ext-azure \
python311-opencensus-ext-azure \
python3dist-opencensus-ext-azure"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-identity \
python311-opencensus \
python311-psutil \
python311-requests"

inherit rpm
