SUMMARY = "Development files for the python-BTrees module"
DESCRIPTION = "This package contains the files needed for binding the python39-BTrees C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-BTrees-devel-5.0-1.4.aarch64.rpm"
RPM_HASH = "b569244466e56803fab16fce2de92aa220a5ea4ec939692f073aa47cb400a11f56a11e706c9cdc346998202c2fd7059c630241d07c8b3b810c49160edb645763"

RPROVIDES:${PN} += "python39-BTrees-devel \
python39-BTrees-devel(aarch-64)"

RDEPENDS:${PN} += "python39-BTrees"

inherit rpm
