SUMMARY = "AngularJS library 'objectpath' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.2.1.0"

RPM_NAME = "python311-XStatic-objectpath-1.2.1.0-1.16.noarch.rpm"
RPM_HASH = "6b9f05a4d07242a6781b20dbf3e13bd73688a8099296fa2173bcb47bb0a3a3acd37a36ad8355f99dc44130b6c5ed0b7afbe9f66ad37594fcc6659feedc4e241d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-objectpath \
python3.11dist-xstatic-objectpath \
python311-XStatic-objectpath \
python3dist-xstatic-objectpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
