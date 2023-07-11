SUMMARY = "Core Schema for Core API"
DESCRIPTION = "Core Schema for Core API, a format-independent Document Object Model for \
representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "0.0.4"

RPM_NAME = "python310-coreschema-0.0.4-2.1.noarch.rpm"
RPM_HASH = "d59b8fd45d8711f46ee0d89d274a4d888de1892d44835277b4fb777ecb5eebddfd14f52c4680061a854ebbff957c8fe91c004f9bdf98aa47b54c5254a731eca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-coreschema \
python310-coreschema \
python3dist-coreschema"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2"

inherit rpm
