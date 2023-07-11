SUMMARY = "A loader implementing the PasteDeploy syntax to be used by plaster"
DESCRIPTION = "plaster_pastedeploy is a plaster plugin that provides a plaster.Loader \
that can parse ini files according to the standard set by PasteDeploy. \
It supports the wsgi plaster protocol, implementing the \
plaster.protocols.IWSGIProtocol interface."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-plaster-pastedeploy-1.0.1-2.3.noarch.rpm"
RPM_HASH = "b1b59a7d128d0ef592509ef679c4d65eb7a1b96a4f67f212d28f7e12fdb159c251cea9c71eebb25bd823a3c4fb538bd9eec8469dd0820245e0e13097c44ffbfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-plaster-pastedeploy \
python310-plaster-pastedeploy \
python3dist-plaster-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python310-PasteDeploy \
python310-plaster"

inherit rpm
