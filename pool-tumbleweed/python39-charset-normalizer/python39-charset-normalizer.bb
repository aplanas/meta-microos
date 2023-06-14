SUMMARY = "Python Universal Charset detector"
DESCRIPTION = "Python Universal Charset detector."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-charset-normalizer-3.1.0-2.1.noarch.rpm"
RPM_HASH = "445456a6abb6a322ca41fce3b11e4f2d3efebcfe5b5e5d6a4c3f652f451cfd82fbc896198a7b2dcc2e8aa8da33a01f7ac574578c09023b7c634a4a8bf0857f08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-charset-normalizer \
python39-charset-normalizer \
python3dist-charset-normalizer"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
