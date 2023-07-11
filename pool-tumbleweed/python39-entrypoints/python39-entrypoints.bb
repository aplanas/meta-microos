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

RPM_NAME = "python39-entrypoints-0.4-2.1.noarch.rpm"
RPM_HASH = "ab33c262961986960de2598c5b25a5ac3d74229c29edc3fcd1565a8fc55378aa82935e57e493ac38187b8f568cba97f5a17323acd9d7e1dfd014820ab36bd177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-entrypoints \
python39-entrypoints \
python3dist-entrypoints"

RDEPENDS:${PN} += "python-abi"

inherit rpm
