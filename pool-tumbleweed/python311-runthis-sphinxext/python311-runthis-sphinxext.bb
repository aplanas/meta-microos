SUMMARY = "Provides a sphinx code-block for rendering RunThis blocks"
DESCRIPTION = "This provides a sphinx extension that adds RunThis code blocks, \
which display a highligthed code-block statically, but with a \
'RunThis' button above them. When the button is clicked, the code \
block is replaced by a terminal session that has executed that \
code."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python311-runthis-sphinxext-0.0.3-1.13.noarch.rpm"
RPM_HASH = "41015d47f094bf3cbbd54f132883b95ba622be70e345680efcb3385addd8119d87fd1aa9a0fa7ffcc3a7ddbad7e085aece8981659540f715113724843e34f4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-runthis-sphinxext \
python3.11dist-runthis-sphinxext \
python311-runthis-sphinxext \
python3dist-runthis-sphinxext"

RDEPENDS:${PN} += "python-abi"

inherit rpm
