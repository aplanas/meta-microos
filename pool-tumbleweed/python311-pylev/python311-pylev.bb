SUMMARY = "A pure Python Levenshtein implementation"
DESCRIPTION = "A pure Python Levenshtein implementation."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python311-pylev-1.4.0-2.2.noarch.rpm"
RPM_HASH = "cd3a1d2bf0e9cbf462c8bda5ba47f4e066ce675aa976962f581e7229c6a38b5090baf177508b98899a23a6a173069ff2967f23ae821b3ac460f7eb4bceba8264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylev \
python3.11dist-pylev \
python311-pylev \
python3dist-pylev"

RDEPENDS:${PN} += "python-abi"

inherit rpm
