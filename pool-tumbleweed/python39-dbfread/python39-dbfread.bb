SUMMARY = "DBF file reader for Python"
DESCRIPTION = "DBF is a file format used by databases such dBase, Visual FoxPro, and \
FoxBase+. This library reads DBF files and returns the data as native \
Python data types for further processing. It is primarily intended for \
batch jobs and one-off scripts."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "python39-dbfread-2.0.7-4.14.noarch.rpm"
RPM_HASH = "3e150d764a2cd3d02043e45ffb796a7ff24f623cb2514ff7a3d91dcef80e32242f06fd7600d2df8555b101935f6ce3df088e9d2c37ac80dc590d435d269c1227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dbfread \
python39-dbfread \
python3dist-dbfread"

RDEPENDS:${PN} += "python-abi"

inherit rpm
