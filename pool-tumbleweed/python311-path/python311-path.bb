SUMMARY = "A module wrapper for os.path"
DESCRIPTION = "The path package implements a path objects as first-class \
entities, allowing common operations on files to be invoked \
on those path objects directly."
LICENSE = "MIT"

PV = "16.6.0"

RPM_NAME = "python311-path-16.6.0-2.1.noarch.rpm"
RPM_HASH = "241141e274c2c14e9dba565d49e72efdf46e93bdb4ce2acda359c4977e8641de4adb1a547a183258b1a5b55717e65c15959687f9645c66838615dd31df2d7456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(path) \
python311-path \
python311-path.py \
python3dist(path)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
