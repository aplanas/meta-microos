SUMMARY = "Command aliases for Click"
DESCRIPTION = "Command aliases for Click."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-click-aliases-1.0.1-3.12.noarch.rpm"
RPM_HASH = "a245225d73c8972535bfa666bfaf467319c7a54aeffb937b94320060a54c26757ae6141b105c0882be504806a786fe3e5db1ca0b881fc7ead654174707946cdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-aliases \
python3.10dist(click-aliases) \
python310-click-aliases \
python3dist(click-aliases)"

RDEPENDS:${PN} += "python(abi) \
python310-click"

inherit rpm
