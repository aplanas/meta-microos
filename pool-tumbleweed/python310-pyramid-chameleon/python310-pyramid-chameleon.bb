SUMMARY = "Pyramid Chameleon integration"
DESCRIPTION = "These are bindings for the `Chameleon templating system \
<http://pagetemplates.org/>`_ for the Pyramid_ web framework."
LICENSE = "BSD-3-Clause & ZPL-2.1 & MIT"

PV = "0.3"

RPM_NAME = "python310-pyramid-chameleon-0.3-5.10.noarch.rpm"
RPM_HASH = "f9a757d803315bbfaf764ad21586334721e558abb832c3bb553a60c73bfddf4daef4ac89cd2bfbd5e96378580dd668af827ab58aa4a18f47a962f823575677f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyramid-chameleon \
python310-pyramid-chameleon \
python3dist-pyramid-chameleon"

RDEPENDS:${PN} += "python-abi \
python310-Chameleon \
python310-pyramid"

inherit rpm
