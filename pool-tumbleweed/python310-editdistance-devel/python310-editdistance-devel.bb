SUMMARY = "Development files for python310-editdistance"
DESCRIPTION = "This package contains the files needed for binding the python310-editdistance C module."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-editdistance-devel-0.6.2-1.6.aarch64.rpm"
RPM_HASH = "d4c444b67210126524bf721f857ce6c3638720c76250cece427bdce35cf83e0a067050031d2c79c0f74ee663c4f80a5f610bf8e40f178e290f05e4b7f1d5cf50"

RPROVIDES:${PN} += "python310-editdistance-devel"

RDEPENDS:${PN} += "python310-base \
python310-editdistance"

inherit rpm
