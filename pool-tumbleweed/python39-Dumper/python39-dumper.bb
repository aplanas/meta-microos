SUMMARY = "Tool to conveniently describe any Python datastructure"
DESCRIPTION = "Tool to conveniently describe any Python datastructure"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-Dumper-1.2.0-2.7.noarch.rpm"
RPM_HASH = "cf849596856aaaaefbc053b4ccb7e6ab954e1b3ea8f6a230916a1d85c3ced84632a3a9af7bbaea8a9e30d8c42460a39d1552baaff1ddc7008edfb7277e39b3ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dumper \
python39-Dumper \
python3dist-dumper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
