SUMMARY = "Configuration validator producing human readable error messages"
DESCRIPTION = "A configuration validator for Python that produce human readable error messages."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python310-cfgv-3.3.1-1.8.noarch.rpm"
RPM_HASH = "4d672374a2e8eaf6ae0aa6f080c997dddfcd459ead46919a8898af32ca9003dfab8dfe8dfd43351ff9975936af79b0bfef433b02add6e95db93d907929c601e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cfgv \
python310-cfgv \
python3dist-cfgv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
