SUMMARY = "Python ini2toml[full] extra requirement"
DESCRIPTION = "The ini2toml[full] extra requirements for python39-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python39-ini2toml-full-0.12-2.2.noarch.rpm"
RPM_HASH = "90710998cfe689fa0b5978690b993aa800679aaa5d784afa8cdc076455144584f77fdcd369a2dceaffc2890b479b6667a9da655a9fef349c19e1744a87569991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ini2toml-full"

RDEPENDS:${PN} += "-python39-configupdater >= 3.0.1 with python39-configupdater < 4 \
-python39-tomlkit >= 0.10 with python39-tomlkit < 2 \
python39-ini2toml"

inherit rpm
