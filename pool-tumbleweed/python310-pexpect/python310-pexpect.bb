SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python310-pexpect-4.8.0-11.1.noarch.rpm"
RPM_HASH = "be1a10ac046cd09816a8637c74819a83ae1c727593a4557b35fefe28a79865a7d1fe3beb1972b01f698f3e579af29510ef7d443b9ae2bae2c576798847f8ede5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pexpect \
python310-pexpect \
python3dist-pexpect"

RDEPENDS:${PN} += "python-abi \
python310-ptyprocess"

inherit rpm
