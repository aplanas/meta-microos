SUMMARY = "Painless YAML configuration"
DESCRIPTION = "Painless YAML configuration."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-confuse-2.0.1-1.1.noarch.rpm"
RPM_HASH = "a7e2afe9d4c7a14b1f13e241a81a2763a6e1f29f940a2bcc18fbb1aacc32275ff4bef79d478141d17a8ba69bdc382f388488c7152bb13fce6d4500d0a9ecbcdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(confuse) \
python39-confuse \
python3dist(confuse)"
RDEPENDS:${PN} += "python(abi) \
python39-PyYAML"

inherit rpm
