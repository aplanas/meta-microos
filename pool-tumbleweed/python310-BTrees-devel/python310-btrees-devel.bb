SUMMARY = "Development files for the python-BTrees module"
DESCRIPTION = "This package contains the files needed for binding the python310-BTrees C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-BTrees-devel-5.0-1.4.aarch64.rpm"
RPM_HASH = "295160d1e2ada186dcbe28a9b305d9f96892833c9f54b2ebae1f6c5eb979c976975d14f5a0db19b94af8f6c562b64a10e4f61f7bf776facc72dc00d00eb0292f"

RPROVIDES:${PN} += "python3-BTrees-devel \
python310-BTrees-devel"

RDEPENDS:${PN} += "python310-BTrees"

inherit rpm
