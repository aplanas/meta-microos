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

RPM_NAME = "python310-entrypoints-0.4-1.3.noarch.rpm"
RPM_HASH = "6dd6557a9611627fe3905d9de800a51f6678bfe0a1a271b9d235f5720e8e3747d8c0018205ddea5a7901e70ef911863184c1b7262c2eb6aca2975a110e70854e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-entrypoints \
python3.10dist-entrypoints \
python310-entrypoints \
python3dist-entrypoints"

RDEPENDS:${PN} += "python-abi"

inherit rpm
