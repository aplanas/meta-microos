SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python311-pygments-ansi-color-0.2.0-1.1.noarch.rpm"
RPM_HASH = "a266eb919c3b650d2d6b79faa69fb212f3a88aac77f57f52d7506a534fff78d5e2212a79cfbbb32b2cdf3fcd765a1f511749a45047c9f0df0721b409c397f018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pygments-ansi-color) \
python311-pygments-ansi-color \
python3dist(pygments-ansi-color)"

RDEPENDS:${PN} += "python(abi) \
python311-pygments \
python311-setuptools"

inherit rpm
