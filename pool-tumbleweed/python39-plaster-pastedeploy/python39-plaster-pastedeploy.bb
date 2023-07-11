SUMMARY = "A loader implementing the PasteDeploy syntax to be used by plaster"
DESCRIPTION = "plaster_pastedeploy is a plaster plugin that provides a plaster.Loader \
that can parse ini files according to the standard set by PasteDeploy. \
It supports the wsgi plaster protocol, implementing the \
plaster.protocols.IWSGIProtocol interface."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-plaster-pastedeploy-1.0.1-2.3.noarch.rpm"
RPM_HASH = "dcf3dd3c6098cf594f5fb025cb107bfd37a621316f865d6494389fc9c0ad9289b0df2b1af492641e8f1c016cb724d772dc72fb5fa4ceed79d327fd0b5ac76c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-plaster-pastedeploy \
python39-plaster-pastedeploy \
python3dist-plaster-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python39-PasteDeploy \
python39-plaster"

inherit rpm
