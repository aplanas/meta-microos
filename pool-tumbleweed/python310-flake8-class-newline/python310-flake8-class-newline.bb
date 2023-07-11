SUMMARY = "Flake8 lint for newline after class definitions"
DESCRIPTION = "Flake8 Extension to lint for a method newline after a Class definition"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-flake8-class-newline-1.6.0-2.10.noarch.rpm"
RPM_HASH = "b6170a74194cb3257a318e9b702293fe34c2570b27822f31b148a0dd7f02ddf7bb86e9fa684f01d33e694b9be1661638b625e6e313dbb71d19dc6906a3a00ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-class-newline \
python310-flake8-class-newline \
python3dist-flake8-class-newline"

RDEPENDS:${PN} += "python-abi \
python310-flake8"

inherit rpm
