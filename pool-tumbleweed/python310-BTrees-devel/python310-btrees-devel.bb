SUMMARY = "Development files for the python-BTrees module"
DESCRIPTION = "This package contains the files needed for binding the python310-BTrees C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-BTrees-devel-5.0-2.3.aarch64.rpm"
RPM_HASH = "73a2dd17afac9f2eb5b4dcf9a650d779961af54caf7bc0788fffab957bc67de9ca98c502de613a27d0308341fda94c5bb77d9ba7dc0e61085d7115bde6d86c3d"

RPROVIDES:${PN} += "python310-BTrees-devel"

RDEPENDS:${PN} += "python310-BTrees"

inherit rpm
