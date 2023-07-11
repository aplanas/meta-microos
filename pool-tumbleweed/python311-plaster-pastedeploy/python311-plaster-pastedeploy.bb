SUMMARY = "A loader implementing the PasteDeploy syntax to be used by plaster"
DESCRIPTION = "plaster_pastedeploy is a plaster plugin that provides a plaster.Loader \
that can parse ini files according to the standard set by PasteDeploy. \
It supports the wsgi plaster protocol, implementing the \
plaster.protocols.IWSGIProtocol interface."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-plaster-pastedeploy-1.0.1-2.3.noarch.rpm"
RPM_HASH = "b5896739caa4c29eac779aa061a1b7170a5a4eb9e90e1b2ae570afd95754069139abb539dfecdefd52ba51b8f9a4e827a013f4726247bbba7597c7b4867ab35c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plaster-pastedeploy \
python3.11dist-plaster-pastedeploy \
python311-plaster-pastedeploy \
python3dist-plaster-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python311-PasteDeploy \
python311-plaster"

inherit rpm
