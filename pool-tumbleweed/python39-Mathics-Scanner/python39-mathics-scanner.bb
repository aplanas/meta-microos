SUMMARY = "Character Tables and Tokenizer for Mathics and the Wolfram Language"
DESCRIPTION = "Character Tables and Tokenizer for Mathics and the Wolfram Language."
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "python39-Mathics-Scanner-1.3.0-1.3.noarch.rpm"
RPM_HASH = "4e58a611b1a8d33fb072ba23e37f1f3157adaf6770b4be496b1fcd8c67fe0e40525b0e99c70dc0e34f25f3ca7858942e14d8c433511d6f56143247546a40de53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mathics-scanner \
python39-Mathics-Scanner \
python3dist-mathics-scanner"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-chardet \
python39-click \
update-alternatives"

inherit rpm
