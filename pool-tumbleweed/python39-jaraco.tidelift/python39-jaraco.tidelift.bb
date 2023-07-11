SUMMARY = "Tools to work with Tidelift"
DESCRIPTION = "jaraco.tidelift Tools for Tidelift"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-jaraco.tidelift-1.5.1-1.3.noarch.rpm"
RPM_HASH = "0f1dd47cae5255788c945ef797a3457e776825e3dd4712a742500d9e51eef922992b74c1b08f4e224ffb1cbfca5710fbaec819ad06145aad5ed15220e7e5c64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.tidelift \
python39-jaraco.tidelift \
python3dist-jaraco.tidelift"

RDEPENDS:${PN} += "python-abi \
python39-autocommand \
python39-importlib-resources \
python39-keyring \
python39-requests-toolbelt"

inherit rpm
