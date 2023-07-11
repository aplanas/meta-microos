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

RPM_NAME = "python311-hatch-fancy-pypi-readme-23.1.0-1.2.noarch.rpm"
RPM_HASH = "d1438cc48eaca030a8ebb97bae945ff9282a3623fa9191c5ae6675887040805fa79e69f616315bb05cd4273b0995c244dd4d92e99399aca7bd1718addd5bbe21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-fancy-pypi-readme \
python3.11dist-hatch-fancy-pypi-readme \
python311-hatch-fancy-pypi-readme \
python3dist-hatch-fancy-pypi-readme"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python3.11dist-hatchling \
update-alternatives"

inherit rpm
