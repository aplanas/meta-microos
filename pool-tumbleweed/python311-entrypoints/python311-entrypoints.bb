SUMMARY = "Discover and load entry points from installed packages"
DESCRIPTION = "Entry points are a way for Python packages to advertise objects with \
some common interface. The most common examples are console_scripts \
entry points, which define shell commands by identifying a Python \
function to run. \
 \
Groups of entry points, such as console_scripts, point to objects with \
similar interfaces. An application might use a group to find its \
plugins, or multiple groups if it has different kinds of plugins."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-entrypoints-0.4-2.1.noarch.rpm"
RPM_HASH = "2b997c801817ce65bd73ae8cf9ac2fde4a7b966dd23c7632f800269ad206390886e4ff4f1ea9f215cffae530055d737cea6b60e4bec1799508eb773ebda68406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-entrypoints \
python3.11dist-entrypoints \
python311-entrypoints \
python3dist-entrypoints"

RDEPENDS:${PN} += "python-abi"

inherit rpm
