SUMMARY = "Development files for the python-BTrees module"
DESCRIPTION = "This package contains the files needed for binding the python311-BTrees C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-BTrees-devel-5.0-1.4.aarch64.rpm"
RPM_HASH = "c3f838df1c43dd4489a5cc666f4719a311642d3287e7bd61e5642195af00355bfc92226270e160265d1e71b477361fad5d2ffe2647cbfca29a5f4a6bc169c320"

RPROVIDES:${PN} += "python311-BTrees-devel \
python311-BTrees-devel(aarch-64)"
RDEPENDS:${PN} += "python311-BTrees"

inherit rpm
