SUMMARY = "Character Tables and Tokenizer for Mathics and the Wolfram Language"
DESCRIPTION = "Character Tables and Tokenizer for Mathics and the Wolfram Language."
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "python311-Mathics-Scanner-1.3.0-1.3.noarch.rpm"
RPM_HASH = "1e359bc088d796de7c4be850cf1e5e5481a8c826f98486f16a0d59bd9c7035ee878f0a0669164d1d56d66de873fb9d99a43d9c09fcd0d40d933f946ba578eb37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Mathics-Scanner \
python3.11dist-mathics-scanner \
python311-Mathics-Scanner \
python3dist-mathics-scanner"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-chardet \
python311-click \
update-alternatives"

inherit rpm
