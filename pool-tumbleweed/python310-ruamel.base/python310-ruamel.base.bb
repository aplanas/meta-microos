SUMMARY = "Shared ruamel routines"
DESCRIPTION = "This is a common package for the 'ruamel' namespace."
LICENSE = "MIT"

PV = "1.0.0+post1"

RPM_NAME = "python310-ruamel.base-1.0.0+post1-2.14.noarch.rpm"
RPM_HASH = "d0840eb9bc53ed1f2015c7a0af7bd97b023b434c31aabb739eab6238d97b8e41c829255cd5224f2ee859ad079fe51f6d47127d23877e8e018993099efc5b55aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.base \
python3.10dist-ruamel.base \
python310-ruamel.base \
python3dist-ruamel.base"

RDEPENDS:${PN} += "python-abi"

inherit rpm
