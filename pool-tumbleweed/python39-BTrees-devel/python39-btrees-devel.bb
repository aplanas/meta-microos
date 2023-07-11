SUMMARY = "Development files for the python-BTrees module"
DESCRIPTION = "This package contains the files needed for binding the python39-BTrees C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-BTrees-devel-5.0-2.3.aarch64.rpm"
RPM_HASH = "baf61233fae9e980e3ff69e4f358b0585f0d697f87c10ba2620f919b540d4536ec1ae5bde130e9b821d72bbff873b6be07b3543a23524b957b1fc6c082d08938"

RPROVIDES:${PN} += "python39-BTrees-devel"

RDEPENDS:${PN} += "python39-BTrees"

inherit rpm
