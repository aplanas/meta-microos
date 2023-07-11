SUMMARY = "CLI tool to convert a python project's  strings to f-strings"
DESCRIPTION = "CLI tool to convert a python project's  strings to f-strings."
LICENSE = "MIT"

PV = "0.76"

RPM_NAME = "python310-flynt-0.76-1.10.noarch.rpm"
RPM_HASH = "e704a59753bc02c2eb0e9d7ddcd8489b9ee793bc5f4e76287a1ac42cbd53f88c64a3a57763480f6382e5704225928b4d393e089999ce1087c79e1f79412b7dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flynt \
python310-flynt \
python3dist-flynt"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-astor \
python310-tomli"

inherit rpm
