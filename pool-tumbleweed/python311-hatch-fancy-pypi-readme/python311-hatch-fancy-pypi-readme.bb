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

RPM_NAME = "python311-hatch-fancy-pypi-readme-23.1.0-1.1.noarch.rpm"
RPM_HASH = "0aa14b6917c68cceb347f33d902730f2f9ce85b3c07651f33445692667b1dd2e06ca6552e5a1f1c49193c4f49a5223ca216cc8f09e061e501683f5153bee9582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-hatch-fancy-pypi-readme \
python311-hatch-fancy-pypi-readme \
python3dist-hatch-fancy-pypi-readme"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python3.11dist-hatchling \
update-alternatives"

inherit rpm
