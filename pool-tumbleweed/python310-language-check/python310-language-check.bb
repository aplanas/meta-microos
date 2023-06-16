SUMMARY = "Python wrapper for checking grammar with LanguageTool"
DESCRIPTION = "Python wrapper for LanguageTool. \
 \
This is a fork of language_tool that produces more easily parsable \
results from the command-line."
LICENSE = "LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "python310-language-check-1.1-4.9.noarch.rpm"
RPM_HASH = "a6a28ce127e24596a87614539847ea60473dc1058a2632e631a987cad28358501ce68f019d4554b924129035e9ebca4c668c7fd8659adf7f99e71410b5ce216a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-language-check \
python3.10dist-language-check \
python310-language-check \
python3dist-language-check"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/python3.10 \
/usr/bin/sh \
java \
python-abi \
update-alternatives"

inherit rpm
