SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python39-pexpect-4.8.0-11.1.noarch.rpm"
RPM_HASH = "a5481163abadb2a37b3cb55854a61b5018488bd307bfe0cf1c032f9adb7d34eef7ae7520cb21917511aaa7458318df3e3b58c99399a5036fca11ac25d7785c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pexpect \
python39-pexpect \
python3dist-pexpect"

RDEPENDS:${PN} += "python-abi \
python39-ptyprocess"

inherit rpm
