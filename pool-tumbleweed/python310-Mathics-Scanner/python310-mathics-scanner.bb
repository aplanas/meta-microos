SUMMARY = "Character Tables and Tokenizer for Mathics and the Wolfram Language"
DESCRIPTION = "Character Tables and Tokenizer for Mathics and the Wolfram Language."
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "python310-Mathics-Scanner-1.3.0-1.3.noarch.rpm"
RPM_HASH = "172d9f5868c0d9697fca29a8e3429cc4928fd7d2bf363437442b5c4af5bee1bdac8ba8f257e87b49eef75815cbe9632372e0e0e6c5383cc5eb1ae0a459813cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mathics-scanner \
python310-Mathics-Scanner \
python3dist-mathics-scanner"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-chardet \
python310-click \
update-alternatives"

inherit rpm
