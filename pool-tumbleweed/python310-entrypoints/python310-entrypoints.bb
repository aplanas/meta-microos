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

RPM_NAME = "python310-entrypoints-0.4-2.1.noarch.rpm"
RPM_HASH = "7c845015d686fe826aac7ff5f9e7f1f0c544ffeedf5a0fd3f3ec280f8066f2cb0810e4db1b3291d6312a469b7956c31161de9b4218b6646a027229e85666650a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-entrypoints \
python310-entrypoints \
python3dist-entrypoints"

RDEPENDS:${PN} += "python-abi"

inherit rpm
