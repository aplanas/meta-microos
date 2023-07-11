SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python311-pexpect-4.8.0-10.3.noarch.rpm"
RPM_HASH = "5e987013abde8e871bb3afe54648249392f8da211d0508f67d955e772699097a1dfe2a5e13da62c95900b665897d5984a8d54378f16d2af2693b7ca7088b36e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pexpect \
python3.11dist-pexpect \
python311-pexpect \
python3dist-pexpect"

RDEPENDS:${PN} += "python-abi \
python311-ptyprocess"

inherit rpm
