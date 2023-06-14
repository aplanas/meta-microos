SUMMARY = "Flake8 lint for newline after class definitions"
DESCRIPTION = "Flake8 Extension to lint for a method newline after a Class definition"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-flake8-class-newline-1.6.0-2.8.noarch.rpm"
RPM_HASH = "2f78b15f34468d91c58e17d1c4a7bb8d2ecbb856265d877ad991fe32adb214fcd7cefbdcfa4ba06507f6da7aa4031b9f208d3a09a852123829d1248a4240df88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-class-newline \
python39-flake8-class-newline \
python3dist-flake8-class-newline"

RDEPENDS:${PN} += "python-abi \
python39-flake8"

inherit rpm
