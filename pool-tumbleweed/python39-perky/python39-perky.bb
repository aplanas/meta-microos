SUMMARY = "A parser for the perky text file format"
DESCRIPTION = "An 'rcfile' text file format for Python programs solving the same \
problem as 'INI' files, 'TOML' files, and 'JSON' files."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python39-perky-0.5.5-1.5.noarch.rpm"
RPM_HASH = "7dd02a832a95fa42a6844051fa12fc43c797cc49c128a58176c3a4ec63abf1ed0d1d6c46ea4fe1ffa5f454f37880eb43674c3e8a8873a4abf1ac93f4e5676ccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-perky \
python39-perky \
python3dist-perky"

RDEPENDS:${PN} += "python-abi"

inherit rpm
