SUMMARY = "Python module for creating testable command-line interfaces"
DESCRIPTION = "Cleo allows you to create beautiful and testable command-line interfaces."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-cleo-2.0.1-2.3.noarch.rpm"
RPM_HASH = "d6500c4317952aac52f29deb4295f8d9abf3097bc268c48a3e3cfb2c10867a112b78f86d84dc0ec2afb054dc51c22586ed18695588907585b823c06794ba874c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cleo \
python310-cleo \
python3dist-cleo"

RDEPENDS:${PN} += "python-abi \
python310-crashtest \
python310-pylev \
python310-rapidfuzz"

inherit rpm
