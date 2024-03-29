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

RPM_NAME = "python39-hatch-fancy-pypi-readme-23.1.0-1.2.noarch.rpm"
RPM_HASH = "ebb4677ab0daa41c4221a2eeff81f9202f6ebf544c861351fb44d3ed84e6766a611c8a0f84f281c14228c73f42414e850c441eb7c0927f01b573aa78afe385ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hatch-fancy-pypi-readme \
python39-hatch-fancy-pypi-readme \
python3dist-hatch-fancy-pypi-readme"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python3.9dist-hatchling \
python3.9dist-tomli \
update-alternatives"

inherit rpm
