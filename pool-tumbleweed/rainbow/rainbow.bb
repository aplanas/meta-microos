SUMMARY = "Colorize commands output or STDIN using patterns"
DESCRIPTION = "Easily colorize logs or commands output using patterns."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "rainbow-2.8.0-1.5.noarch.rpm"
RPM_HASH = "4f95223387b05d8ba431d23e5a5a6597ea8250a3a1b2d7a887aa58ea5d7ea1a62634c33c5ed021c3c60a1c610a62bf85e1f2f6baa3fbf082609467e2570f2445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rainbow \
python3dist-rainbow \
rainbow"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
