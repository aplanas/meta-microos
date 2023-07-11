SUMMARY = "Python wrapper for checking grammar with LanguageTool"
DESCRIPTION = "Python wrapper for LanguageTool. \
 \
This is a fork of language_tool that produces more easily parsable \
results from the command-line."
LICENSE = "LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "python311-language-check-1.1-4.10.noarch.rpm"
RPM_HASH = "afc66ae8aec3acbfa856f54f67c07f4557e10a7eef8ccd2bacd91bdb68d52218b0ad1d9d4053c533457da67ebedb6059c386bd57ff2552123eaaaefd222a4f86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-language-check \
python3.11dist-language-check \
python311-language-check \
python3dist-language-check"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/python3.11 \
/usr/bin/sh \
java \
python-abi \
update-alternatives"

inherit rpm
