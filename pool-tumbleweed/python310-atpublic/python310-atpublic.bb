SUMMARY = "@public decorator for populating __all__"
DESCRIPTION = "public -- @public for populating __all__."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python310-atpublic-3.1.1-2.2.noarch.rpm"
RPM_HASH = "250d1ccc0fd101671c94667a2853b96f89c9692da4f2a68aa4f19b81dd64344ae65e829a8cd43ddb307c713a1b726913917724998ed89aeb130cfed18def682d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-atpublic \
python3.10dist-atpublic \
python310-atpublic \
python3dist-atpublic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
