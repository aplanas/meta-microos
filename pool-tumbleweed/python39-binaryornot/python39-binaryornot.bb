SUMMARY = "Python package to check if a file is binary or text"
DESCRIPTION = "Pure Python package to guess whether a file is binary or text, \
using a heuristic similar to Perl's pp_fttext and its analysis \
by eliben."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python39-binaryornot-0.4.4-4.1.noarch.rpm"
RPM_HASH = "8b7843823fa800272256f47940ff8a98f22e2455a57266bb295f0eff41a719a3b7876a506b276df6b9a37480dd0d4d6f0a19b423b659a1dff593214e9afbfc92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-binaryornot \
python39-binaryornot \
python3dist-binaryornot"

RDEPENDS:${PN} += "python-abi \
python39-chardet"

inherit rpm
