SUMMARY = "Automatic generated to pep8 checked code"
DESCRIPTION = "Autopep8 is automatic generated to pep8 checked code. \
This is old style tool, wrapped pep8 via subprocess module."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-autopep8-2.0.2-2.1.noarch.rpm"
RPM_HASH = "7054245399b326d134bbc7c6ee7c2ef4a5029e8d7873d6d8156e1e92fab1ccc410109a0f52fd8dc12c04165d1966c880807a09602f580f75f7b664903abeb09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-autopep8 \
python39-autopep8 \
python3dist-autopep8"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pycodestyle \
python39-tomli \
update-alternatives"

inherit rpm
