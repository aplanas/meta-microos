SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python311-specfile-0.22.0-1.1.noarch.rpm"
RPM_HASH = "27d4e2116bc97d5039027dc0f209f5b19a8a609bed17b76b0111c01e67ba41225a9026932fb58c4b0c2874dede299f51b64579715c0d0cca9674c5d40575b15d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-specfile \
python3.11dist-specfile \
python311-specfile \
python3dist-specfile"

RDEPENDS:${PN} += "python-abi \
python310-typing-extensions \
python311-rpm \
python311-typing-extensions \
python39-typing-extensions"

inherit rpm
