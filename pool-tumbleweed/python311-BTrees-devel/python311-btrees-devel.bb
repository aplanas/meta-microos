SUMMARY = "Development files for the python-BTrees module"
DESCRIPTION = "This package contains the files needed for binding the python311-BTrees C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-BTrees-devel-5.0-2.3.aarch64.rpm"
RPM_HASH = "4573de98952f0d52c8323bfab047f2a71c7af32e49cfbdb15a1620279ce5aebf8489cb9493e7d6d903a7d29f227d5dfb02ac492143fc88880c5c3bf35dc33ff4"

RPROVIDES:${PN} += "python3-BTrees-devel \
python311-BTrees-devel"

RDEPENDS:${PN} += "python311-BTrees"

inherit rpm
