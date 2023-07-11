SUMMARY = "Composable complex class support for attrs and dataclasses"
DESCRIPTION = "Composable complex class support for attrs and dataclasses."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python311-cattrs-22.2.0-2.3.noarch.rpm"
RPM_HASH = "a478d184bdc0f688d678866f2a79c6ddad2c3e20232259421093cc9e16275a51fed50deb02f476cddbdc7b552c9636b14918925b1047feb28ae3b23cb83bd0bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cattrs \
python3.11dist-cattrs \
python311-cattrs \
python3dist-cattrs"

RDEPENDS:${PN} += "python-abi \
python311-attrs"

inherit rpm
