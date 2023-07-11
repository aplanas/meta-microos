SUMMARY = "Development files of libfpm_helper0"
DESCRIPTION = "Development Files of libfpm_helper0."
LICENSE = "MIT"

PV = "4.7.1"

RPM_NAME = "libfpm_helper-devel-4.7.1-1.17.aarch64.rpm"
RPM_HASH = "2bb79ea6acd02af1739fea95d004be51641cf519c4b7d4ba7d955c7b72977f1bf7891f1370a0e148458c07a217c871e36e20fad358176b089546308d238a73df"

RPROVIDES:${PN} += "libfpm-helper-devel"

RDEPENDS:${PN} += "libfpm-helper0"

inherit rpm
