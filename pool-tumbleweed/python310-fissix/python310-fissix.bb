SUMMARY = "Backport of lib2to3, with enhancements"
DESCRIPTION = "Backport of latest lib2to3, with enhancements."
LICENSE = "Python-2.0"

PV = "21.11.13"

RPM_NAME = "python310-fissix-21.11.13-1.17.noarch.rpm"
RPM_HASH = "4e07ea5a28cd51cc3e982e509bace1dd9948b606720a1eb42a6bcda5fd2632cdedcf5b135b426329d82d6f7af7eb2874e4c4bc13883e96c0be985b1621224a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fissix \
python310-fissix \
python3dist-fissix"

RDEPENDS:${PN} += "python-abi \
python310-appdirs"

inherit rpm
