SUMMARY = "DBF file reader for Python"
DESCRIPTION = "DBF is a file format used by databases such dBase, Visual FoxPro, and \
FoxBase+. This library reads DBF files and returns the data as native \
Python data types for further processing. It is primarily intended for \
batch jobs and one-off scripts."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "python311-dbfread-2.0.7-4.16.noarch.rpm"
RPM_HASH = "3e0fcaa9b1c984440d66bd3324f11d87a0f774bd673eab88d4f9ca3f45149e17e8d4fd31f04d1eeb2f14bee5d93119a82e2e9e3f1eeb644c08a64d1ed9530056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbfread \
python3.11dist-dbfread \
python311-dbfread \
python3dist-dbfread"

RDEPENDS:${PN} += "python-abi"

inherit rpm
