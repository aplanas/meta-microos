SUMMARY = "Character Tables and Tokenizer for Mathics and the Wolfram Language"
DESCRIPTION = "Character Tables and Tokenizer for Mathics and the Wolfram Language."
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "python310-Mathics-Scanner-1.3.0-1.1.noarch.rpm"
RPM_HASH = "e9270a93661b34b4665ce3921e4b9a836c6230f7d9026624f42527c7c43701bc0f25a05ca2b8e29fc09a163ea2a6f9d0235d6d1a7dd2109d586adba7939531bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Mathics-Scanner \
python3.10dist(mathics-scanner) \
python310-Mathics-Scanner \
python3dist(mathics-scanner)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-chardet \
python310-click \
update-alternatives"

inherit rpm
