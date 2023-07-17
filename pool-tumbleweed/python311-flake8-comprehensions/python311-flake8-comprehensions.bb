SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin that helps you write better list/set/dict comprehensions."
LICENSE = "ISC"

PV = "3.14.0"

RPM_NAME = "python311-flake8-comprehensions-3.14.0-1.1.noarch.rpm"
RPM_HASH = "3d02f942794fb23196c3c1c22061eeaa3f8d837b83bc4aeec72b3fd1c28533ccecd0c785b7171e897d59e14a177c2fdf0a4fb7b54954f1c98b8cb033d82b3e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-comprehensions \
python3.11dist-flake8-comprehensions \
python311-flake8-comprehensions \
python3dist-flake8-comprehensions"

RDEPENDS:${PN} += "python-abi \
python311-flake8"

inherit rpm
