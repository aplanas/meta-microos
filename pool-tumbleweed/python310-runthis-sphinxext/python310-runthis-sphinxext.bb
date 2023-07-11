SUMMARY = "Provides a sphinx code-block for rendering RunThis blocks"
DESCRIPTION = "This provides a sphinx extension that adds RunThis code blocks, \
which display a highligthed code-block statically, but with a \
'RunThis' button above them. When the button is clicked, the code \
block is replaced by a terminal session that has executed that \
code."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python310-runthis-sphinxext-0.0.3-1.13.noarch.rpm"
RPM_HASH = "4ddd47e749aba7fbc6a457690073d8d120c0aa2f5fe5553c4a59b615669e68315d4a698ffbc93d8596b2d955b329887c398aabe782481fb30488cb30b27e038f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-runthis-sphinxext \
python310-runthis-sphinxext \
python3dist-runthis-sphinxext"

RDEPENDS:${PN} += "python-abi"

inherit rpm
