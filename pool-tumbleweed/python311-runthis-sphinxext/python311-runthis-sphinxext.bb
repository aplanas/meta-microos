SUMMARY = "Provides a sphinx code-block for rendering RunThis blocks"
DESCRIPTION = "This provides a sphinx extension that adds RunThis code blocks, \
which display a highligthed code-block statically, but with a \
'RunThis' button above them. When the button is clicked, the code \
block is replaced by a terminal session that has executed that \
code."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python311-runthis-sphinxext-0.0.3-1.12.noarch.rpm"
RPM_HASH = "accfa8d161c3ff1ced4950e0c29bbdc97f275b7c9aa6a2461fdf52593d8e9b84e18132854f888f4804b167c0c82028c5d4723a932c24dd1f5cc3c273640202b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-runthis-sphinxext \
python311-runthis-sphinxext \
python3dist-runthis-sphinxext"

RDEPENDS:${PN} += "python-abi"

inherit rpm
