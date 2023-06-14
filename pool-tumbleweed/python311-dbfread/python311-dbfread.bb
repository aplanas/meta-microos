SUMMARY = "DBF file reader for Python"
DESCRIPTION = "DBF is a file format used by databases such dBase, Visual FoxPro, and \
FoxBase+. This library reads DBF files and returns the data as native \
Python data types for further processing. It is primarily intended for \
batch jobs and one-off scripts."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "python311-dbfread-2.0.7-4.14.noarch.rpm"
RPM_HASH = "c4a735b6d9f0b9a7e82af081295b904ce573fcb3ec45b64551af9f2bc8dd80b6ae1b9eac83a18b26946147b6592a0e0727d2709f468411eea28cf07469255d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dbfread \
python311-dbfread \
python3dist-dbfread"

RDEPENDS:${PN} += "python-abi"

inherit rpm
