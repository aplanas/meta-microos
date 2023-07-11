SUMMARY = "Python ini2toml[full] extra requirement"
DESCRIPTION = "The ini2toml[full] extra requirements for python311-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python311-ini2toml-full-0.12-2.2.noarch.rpm"
RPM_HASH = "bc9bfbb08db9a02ecb41aa7e48cdbab0e3e267186621673c7c0e31998f4087e01ab98c4d4bd427c96d0d8b4eace12db04c6c4cfa376f572fb684370be057c68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-full \
python311-ini2toml-full"

RDEPENDS:${PN} += "-python311-configupdater >= 3.0.1 with python311-configupdater < 4 \
-python311-tomlkit >= 0.10 with python311-tomlkit < 2 \
python311-ini2toml"

inherit rpm
