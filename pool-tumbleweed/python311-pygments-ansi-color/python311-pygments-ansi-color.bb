SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python311-pygments-ansi-color-0.2.0-1.3.noarch.rpm"
RPM_HASH = "bc2e87f95bd1696bd0b902c824a937956e24393388afb529c4865394282292efdabfa483592d6847557b93dc57e866a82c88b11fe30251d7e239b7c630a2d825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygments-ansi-color \
python3.11dist-pygments-ansi-color \
python311-pygments-ansi-color \
python3dist-pygments-ansi-color"

RDEPENDS:${PN} += "python-abi \
python311-pygments \
python311-setuptools"

inherit rpm
