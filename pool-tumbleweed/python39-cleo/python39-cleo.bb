SUMMARY = "Python module for creating testable command-line interfaces"
DESCRIPTION = "Cleo allows you to create beautiful and testable command-line interfaces."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-cleo-2.0.1-2.3.noarch.rpm"
RPM_HASH = "fd516cc4d2ca07a3c147d8b4bfa5d2e5b973180954dc65421c29d886380737e8ecbc449a2fcad2be8e483cd47f38a8d71f8455e7e8c07393cee9c788594eb832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cleo \
python39-cleo \
python3dist-cleo"

RDEPENDS:${PN} += "python-abi \
python39-crashtest \
python39-pylev \
python39-rapidfuzz"

inherit rpm
