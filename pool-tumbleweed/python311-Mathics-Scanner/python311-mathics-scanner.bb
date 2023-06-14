SUMMARY = "Character Tables and Tokenizer for Mathics and the Wolfram Language"
DESCRIPTION = "Character Tables and Tokenizer for Mathics and the Wolfram Language."
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "python311-Mathics-Scanner-1.3.0-1.1.noarch.rpm"
RPM_HASH = "94d689bdac93bb597c419752f030e45aa0513a84852314f8aa9e262276349cbd95fda0f05724146bb74de8d837cf11bb64aec9b56eee0bf289e9ad6a0139b193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mathics-scanner \
python311-Mathics-Scanner \
python3dist-mathics-scanner"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
/usr/bin/python3.11 \
python-abi \
python311-PyYAML \
python311-chardet \
python311-click \
update-alternatives"

inherit rpm
