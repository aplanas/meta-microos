SUMMARY = "A module wrapper for os.path"
DESCRIPTION = "The path package implements a path objects as first-class \
entities, allowing common operations on files to be invoked \
on those path objects directly."
LICENSE = "MIT"

PV = "16.6.0"

RPM_NAME = "python311-path-16.6.0-2.3.noarch.rpm"
RPM_HASH = "d0fbd2a2355458bbe9a994a0576ba0e465441e527098f790e8caf034c607370e7e86b991d54de9bff4b6d77c0be8ae6c7ef30596a7826282c466ce891beb47ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-path \
python3-path.py \
python3.11dist-path \
python311-path \
python311-path.py \
python3dist-path"

RDEPENDS:${PN} += "python-abi"

inherit rpm
