SUMMARY = "Mako template bindings for the Pyramid web framework"
DESCRIPTION = "Mako template bindings for the Pyramid web framework."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-pyramid-mako-1.1.0-3.10.noarch.rpm"
RPM_HASH = "df5d86aef30a0f4e5cc2cd9afbcc81164b92a57d1f09bf93129173783088a59ae2f6d7de7b9c380d54595600a751de5d5bd5ccc1e2aa8c2c9a89696afb130916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid-mako \
python3.11dist-pyramid-mako \
python311-pyramid-mako \
python3dist-pyramid-mako"

RDEPENDS:${PN} += "python-abi \
python311-Mako \
python311-pyramid"

inherit rpm
