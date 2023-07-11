SUMMARY = "Dictdiffer is a library that helps you to diff and patch dictionaries"
DESCRIPTION = "Dictdiffer is a library that helps you to diff and patch dictionaries."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-dictdiffer-0.9.0-2.8.noarch.rpm"
RPM_HASH = "ac8a56b2b45f41b923b5f79b7109513b80d0d39aaa09c23a58b6a81317b509b781b0f4bab18526d0e274acd4d89b8de2746a34127539f49bf5de1895bb9ab9d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dictdiffer \
python39-dictdiffer \
python3dist-dictdiffer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
