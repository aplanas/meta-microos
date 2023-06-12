SUMMARY = "Python wrapper for checking grammar with LanguageTool"
DESCRIPTION = "Python wrapper for LanguageTool. \
 \
This is a fork of language_tool that produces more easily parsable \
results from the command-line."
LICENSE = "LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "python39-language-check-1.1-4.9.noarch.rpm"
RPM_HASH = "7026bd58efbf9cdbd702e6ca14adbd2a214a320806c3527a837a464d7a2034463839b112d2b75063becb331529143fc75e703127176af7fbda30cd409b065561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(language-check) \
python39-language-check \
python3dist(language-check)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/python3.9 \
java \
python(abi) \
update-alternatives"

inherit rpm
