SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python39-pexpect-4.8.0-13.1.noarch.rpm"
RPM_HASH = "19a842bb7ae0729c97e96f3fe25b59f0aef4a168e087212b8cf61a8fbdd37358b0eb72813a0be83ffecc6b2b602a3a747fea480e25461ee801db8375382c9d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pexpect \
python39-pexpect \
python3dist-pexpect"

RDEPENDS:${PN} += "python-abi \
python39-ptyprocess"

inherit rpm
