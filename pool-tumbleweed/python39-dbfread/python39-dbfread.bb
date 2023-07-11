SUMMARY = "DBF file reader for Python"
DESCRIPTION = "DBF is a file format used by databases such dBase, Visual FoxPro, and \
FoxBase+. This library reads DBF files and returns the data as native \
Python data types for further processing. It is primarily intended for \
batch jobs and one-off scripts."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "python39-dbfread-2.0.7-4.16.noarch.rpm"
RPM_HASH = "2f7c4d27fba8f5cfb3ccd7bcd4ea373e6b2b511d1f6d29a64b29c4e9876529f09eff8b0a4b51db0a6d7843993a823c67069b3583a555a7d1bca63db26590527a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dbfread \
python39-dbfread \
python3dist-dbfread"

RDEPENDS:${PN} += "python-abi"

inherit rpm
