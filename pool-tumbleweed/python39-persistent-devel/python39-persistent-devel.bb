SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains the files needed for binding the python39-persistent C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-persistent-devel-5.0-2.3.aarch64.rpm"
RPM_HASH = "ca2e0a9cf4da4a7989c9bb6333a34f04a174087950e8fb3cfe825d274cca8fa487fd478678b010151de593d6066c242e7f45451fead3f6c35b228e2b31fc3aa1"

RPROVIDES:${PN} += "python39-persistent-devel"

RDEPENDS:${PN} += "python39-devel \
python39-persistent"

inherit rpm
