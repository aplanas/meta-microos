SUMMARY = "Provides a sphinx code-block for rendering RunThis blocks"
DESCRIPTION = "This provides a sphinx extension that adds RunThis code blocks, \
which display a highligthed code-block statically, but with a \
'RunThis' button above them. When the button is clicked, the code \
block is replaced by a terminal session that has executed that \
code."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python39-runthis-sphinxext-0.0.3-1.12.noarch.rpm"
RPM_HASH = "6e3dc5fbc016bf3898f69740377332c71c9a6a089c0968ff18cd2bdb532eef6c5561996ba65f0e8120a6923fd5a95380ad1d7da7e64d2eed81b60896f34aaa3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-runthis-sphinxext \
python39-runthis-sphinxext \
python3dist-runthis-sphinxext"

RDEPENDS:${PN} += "python-abi"

inherit rpm
