SUMMARY = "Bash style brace expander"
DESCRIPTION = "Bash style brace expander."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python311-bracex-2.2.1-3.3.noarch.rpm"
RPM_HASH = "f4341c47bfa1825e57ac0317cdaefb9e5d4298a737419e5c331e23138e27f622af9aa049140f77dbe3f45ce0fea926df023240ee7282765943184c31b8f2d743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bracex \
python3.11dist-bracex \
python311-bracex \
python3dist-bracex"

RDEPENDS:${PN} += "python-abi"

inherit rpm
