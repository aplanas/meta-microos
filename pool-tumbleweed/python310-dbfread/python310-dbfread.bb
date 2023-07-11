SUMMARY = "DBF file reader for Python"
DESCRIPTION = "DBF is a file format used by databases such dBase, Visual FoxPro, and \
FoxBase+. This library reads DBF files and returns the data as native \
Python data types for further processing. It is primarily intended for \
batch jobs and one-off scripts."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "python310-dbfread-2.0.7-4.16.noarch.rpm"
RPM_HASH = "39f94ff641c9d3d2929dcc4a3bce736e25fa1da2cfff7c5c2e2d4f247dab5dc8a433c35a96953aec305c1f845807b56f056816411b19f79f783c5f5bde73faff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dbfread \
python310-dbfread \
python3dist-dbfread"

RDEPENDS:${PN} += "python-abi"

inherit rpm
