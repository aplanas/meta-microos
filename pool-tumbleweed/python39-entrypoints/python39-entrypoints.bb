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

RPM_NAME = "python39-entrypoints-0.4-1.3.noarch.rpm"
RPM_HASH = "7e68dc773c232b4afb68cd34aef5224b1a925d87c964896f69f69427378eceadc27bf2a031eeb9759a932b67ff71dc1a0fdca23a721db19af056adab630f61f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(entrypoints) \
python39-entrypoints \
python3dist(entrypoints)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
