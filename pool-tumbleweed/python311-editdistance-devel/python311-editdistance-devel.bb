SUMMARY = "Development files for python311-editdistance"
DESCRIPTION = "This package contains the files needed for binding the python311-editdistance C module."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-editdistance-devel-0.6.2-1.4.aarch64.rpm"
RPM_HASH = "520cb15d5838f4bac205297c497e91ee44d77532a67fb3abedd5ed97a85dd59dc1dacce11bf523df33d7798e0a87b60260df1e7752561522eddb2ceb1684ab7a"

RPROVIDES:${PN} += "python311-editdistance-devel"

RDEPENDS:${PN} += "python311-base \
python311-editdistance"

inherit rpm
