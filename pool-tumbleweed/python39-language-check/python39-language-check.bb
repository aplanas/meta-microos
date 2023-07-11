SUMMARY = "Python wrapper for checking grammar with LanguageTool"
DESCRIPTION = "Python wrapper for LanguageTool. \
 \
This is a fork of language_tool that produces more easily parsable \
results from the command-line."
LICENSE = "LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "python39-language-check-1.1-4.10.noarch.rpm"
RPM_HASH = "1816aaf448f8cd19629d4a9bf1252247285e88751ecc5920f8f79e4a433acd5e14fda2723a1c0b47d9cb61affcfbabcae2de507dcb9ce769a1dc824e160d40ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-language-check \
python39-language-check \
python3dist-language-check"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/python3.9 \
/usr/bin/sh \
java \
python-abi \
update-alternatives"

inherit rpm
