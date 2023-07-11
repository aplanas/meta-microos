SUMMARY = "Sphinx 'blockdiag' extension"
DESCRIPTION = "A sphinx extension for embedding block diagram using blockdiag."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python310-sphinxcontrib-blockdiag-3.0.0-3.5.noarch.rpm"
RPM_HASH = "25ad0f1777dcdefc94a091f389f0adb1b6b7d9f4283da34af7ce6741c217b7b99bb61def0bd2dc9a9a69e1f5d2793fcbe084059ccc7c4079ca8acd6a550d80a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-blockdiag \
python310-sphinxcontrib-blockdiag \
python3dist-sphinxcontrib-blockdiag"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-blockdiag"

inherit rpm
