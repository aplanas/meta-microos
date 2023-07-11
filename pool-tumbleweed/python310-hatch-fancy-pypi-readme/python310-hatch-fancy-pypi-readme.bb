SUMMARY = "Fancy PyPI READMEs with Hatch"
DESCRIPTION = "hatch_fancy_pypi_readme is a Hatch metadata plugin for everyone who cares about \
the first impression of their project's PyPI landing page. It allows you to \
define your PyPI project description in terms of concatenated fragments that \
are based on static strings, files, and most importantly: parts of files \
defined using cut-off points or regular expressions. \
 \
Once you've assembled your readme, you can additionally run regular \
expression-based substitutions over it. For instance to make relative links \
absolute or to linkify users and issue numbers in your changelog. \
 \
Do you want your PyPI readme to be the project readme, but without badges, \
followed by the license file, and the changelog section for only the last \
release? You've come to the right place!"
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python310-hatch-fancy-pypi-readme-23.1.0-1.2.noarch.rpm"
RPM_HASH = "5ed7d115321c0ba335a585bc2c864fa39e79d0b5e7ffe161a66a76fcd27ff7b36b5a0a7b2e49c67fa42e8028307c7a94b830c23b1d101057a6e09a7dbd697e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hatch-fancy-pypi-readme \
python310-hatch-fancy-pypi-readme \
python3dist-hatch-fancy-pypi-readme"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python3.10dist-hatchling \
python3.10dist-tomli \
update-alternatives"

inherit rpm
