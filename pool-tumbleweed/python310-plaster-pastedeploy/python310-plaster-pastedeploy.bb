SUMMARY = "A loader implementing the PasteDeploy syntax to be used by plaster"
DESCRIPTION = "plaster_pastedeploy is a plaster plugin that provides a plaster.Loader \
that can parse ini files according to the standard set by PasteDeploy. \
It supports the wsgi plaster protocol, implementing the \
plaster.protocols.IWSGIProtocol interface."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-plaster-pastedeploy-1.0.1-1.3.noarch.rpm"
RPM_HASH = "eb9ec3d5e01a54fb51c17c0ea3ce77f9f03c908e4823e8f042d904a0955dd4ef5465a52a8faf813fdfc916457eaaded4441c7bf7fab4dcfc9f96c29eb23f40b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plaster-pastedeploy \
python3.10dist-plaster-pastedeploy \
python310-plaster-pastedeploy \
python3dist-plaster-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python310-PasteDeploy \
python310-plaster"

inherit rpm
