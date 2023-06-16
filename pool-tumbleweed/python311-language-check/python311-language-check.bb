SUMMARY = "Python wrapper for checking grammar with LanguageTool"
DESCRIPTION = "Python wrapper for LanguageTool. \
 \
This is a fork of language_tool that produces more easily parsable \
results from the command-line."
LICENSE = "LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "python311-language-check-1.1-4.9.noarch.rpm"
RPM_HASH = "3c6f4a424ae36732a3ad67691198944497bc6878bfc3ef4e5355a8216d6a3aaeb9eb0347e591a642d6515c1082370ce0f142351a02280b53e395ca2b62533271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-language-check \
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
