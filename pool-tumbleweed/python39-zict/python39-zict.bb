SUMMARY = "Mutable mapping tools"
DESCRIPTION = "Mutable Mapping interfaces for python."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-zict-2.2.0-1.5.noarch.rpm"
RPM_HASH = "49a1beacd74703680731415f30d6ceffc132ace042753cf3e972d96d7676da61f87c4a77a869eb27fd67289d1ea21ffccd3004e5f5b00f8949bdbd7327678708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zict \
python39-zict \
python3dist-zict"

RDEPENDS:${PN} += "python-abi \
python39-HeapDict"

inherit rpm
