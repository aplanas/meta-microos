SUMMARY = "DBF file reader for Python"
DESCRIPTION = "DBF is a file format used by databases such dBase, Visual FoxPro, and \
FoxBase+. This library reads DBF files and returns the data as native \
Python data types for further processing. It is primarily intended for \
batch jobs and one-off scripts."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "python310-dbfread-2.0.7-4.14.noarch.rpm"
RPM_HASH = "ae1632ffc7ece58b7d0b54415652538e355e0f4a68b4f916fa6e93f403dad6cb086c49987ccce2b4e13ab9a0f5c36520ce9fcfb409aa15bb385b37e6517ba987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbfread \
python3.10dist-dbfread \
python310-dbfread \
python3dist-dbfread"

RDEPENDS:${PN} += "python-abi"

inherit rpm
