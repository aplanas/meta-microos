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

RPM_NAME = "python310-hatch-fancy-pypi-readme-23.1.0-1.1.noarch.rpm"
RPM_HASH = "339aa95164b07c3d12c824c6ee3e2b7be12c3bc0529dd6938dd6face65235b6710d06f782f44100a233ff129c0373a46a1dd70da0bf1a24c23cae7ca1f403e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-fancy-pypi-readme \
python3.10dist-hatch-fancy-pypi-readme \
python310-hatch-fancy-pypi-readme \
python3dist-hatch-fancy-pypi-readme"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python3.10dist-hatchling \
python3.10dist-tomli \
update-alternatives"

inherit rpm
