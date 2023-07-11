SUMMARY = "Useragent faker package for Python"
DESCRIPTION = "Useragent faker with real world database."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python310-fake-useragent-1.1.3-1.3.noarch.rpm"
RPM_HASH = "2aadef328ab296b7399022028aee2155b7c8368cabae60621bef34c410b4a402e973c4ac7ebd8d6c0d3b62bbeb958851634ba54bc1b10549c0fc630626da559e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fake-useragent \
python310-fake-useragent \
python3dist-fake-useragent"

RDEPENDS:${PN} += "python-abi \
python310-importlib-resources"

inherit rpm
