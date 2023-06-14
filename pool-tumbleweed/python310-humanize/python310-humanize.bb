SUMMARY = "Python humanize utilities"
DESCRIPTION = "This modest package contains various common humanization utilities, like turning \
a number into a fuzzy human readable duration ('3 minutes ago') or into a human \
readable size or throughput."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python310-humanize-4.4.0-1.3.noarch.rpm"
RPM_HASH = "6e8f8477b77b10fda0123298f53d94f0c7b588f2d653d1f16df366ea2910fbca1533cf29dbbe32813fdeee8289cb011e1da60459f5aac9401bc5923f2892412f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanize \
python3.10dist-humanize \
python310-humanize \
python3dist-humanize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
