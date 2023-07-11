SUMMARY = "Python wrapper for checking grammar with LanguageTool"
DESCRIPTION = "Python wrapper for LanguageTool. \
 \
This is a fork of language_tool that produces more easily parsable \
results from the command-line."
LICENSE = "LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "python310-language-check-1.1-4.10.noarch.rpm"
RPM_HASH = "b6977b2d735fcf4ea1b583856d12561ab4b4c23d04d414a3e7f05ed5849e2e3b95e7f6dffa457fabd8778fab17b0eba2346c56b93eeb5c4dcde0d96c16bf866a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-language-check \
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
