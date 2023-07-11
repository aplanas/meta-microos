SUMMARY = "Flake8 deprecations plugin"
DESCRIPTION = "This flake8 plugin helps you keeping up with method deprecations and giving hints about what \
they should be replaced with."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "python310-flake8-deprecated-2.0.1-1.5.noarch.rpm"
RPM_HASH = "e1dc24e059fd316becf3e56f5e02d809919513029daf8b0920865a796784cc1f46311e00a027bbed4f7b36c3f9b1db87cec1522641cfcf74a29e8099e1ff5384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-deprecated \
python310-flake8-deprecated \
python3dist-flake8-deprecated"

RDEPENDS:${PN} += "python-abi \
python310-flake8"

inherit rpm
