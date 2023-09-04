SUMMARY = "DICOM I/O plugin for the Spyder IDE"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package contains the plugin that allows Spyder to read and write \
DICOM files."
LICENSE = "MIT"

PV = "5.4.4"

RPM_NAME = "spyder-dicom-5.4.4-1.1.noarch.rpm"
RPM_HASH = "1a4b5d81551ce9ded4dd834f1b19e3fd29bb9c44fb444e18ae3221192fa362ccfa304a17de88238f1c0c6565bafce4cb4843675516ca6dcc75b6dd32ba11f772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spyder-dicom \
spyder3-dicom"

RDEPENDS:${PN} += "python-abi \
python3-pydicom \
spyder"

inherit rpm
