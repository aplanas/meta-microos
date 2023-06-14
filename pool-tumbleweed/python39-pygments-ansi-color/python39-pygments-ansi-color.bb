SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python39-pygments-ansi-color-0.2.0-1.1.noarch.rpm"
RPM_HASH = "84d401e19b2948d65df3e2c9e7b92e4548af733b9c1952484f149daf5f182559ce82c82d66692bf1a8e7399b609218283c9757adf62eb542de688cf245e37c02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygments-ansi-color \
python39-pygments-ansi-color \
python3dist-pygments-ansi-color"

RDEPENDS:${PN} += "python-abi \
python39-pygments \
python39-setuptools"

inherit rpm
