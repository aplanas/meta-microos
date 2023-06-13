SUMMARY = "DICOM I/O plugin for the Spyder IDE"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package contains the plugin that allows Spyder to read and write \
DICOM files."
LICENSE = "MIT"

PV = "5.4.3"

RPM_NAME = "spyder-dicom-5.4.3-1.1.noarch.rpm"
RPM_HASH = "d7dac98a2cc05c73b513a54e357224aaefe4fffd338acb59f9bcb102f7c4879c375d1925f724db93f62a0ca4415785b449e1703dc5a2c0db0e4f3bfef4f6d7f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spyder-dicom \
spyder3-dicom"

RDEPENDS:${PN} += "python(abi) \
python3-pydicom \
spyder"

inherit rpm
