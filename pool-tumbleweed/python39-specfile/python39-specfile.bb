SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python39-specfile-0.22.0-1.1.noarch.rpm"
RPM_HASH = "bd2cedf41b809713b866b4681a34ee89d1488a47378fc064a35b053eb1085caca53fe7a26adb0ca2ad14a3cfd53b43d6e22506b396d97b7e00fa6b68b3e16e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-specfile \
python39-specfile \
python3dist-specfile"

RDEPENDS:${PN} += "python-abi \
python310-typing-extensions \
python311-typing-extensions \
python39-rpm \
python39-typing-extensions"

inherit rpm
