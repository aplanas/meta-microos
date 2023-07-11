SUMMARY = "Development files for python311-editdistance"
DESCRIPTION = "This package contains the files needed for binding the python311-editdistance C module."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-editdistance-devel-0.6.2-1.6.aarch64.rpm"
RPM_HASH = "de29bf09a9ccfea2d041e312cbf023e71bb41b126dce81bd8320beeddfbc7f295f8a1559f78bcc0157f506e4b5db7abd0a56b2eecc02e81531072ebf85fe07ca"

RPROVIDES:${PN} += "python3-editdistance-devel \
python311-editdistance-devel"

RDEPENDS:${PN} += "python311-base \
python311-editdistance"

inherit rpm
