SUMMARY = "Codecs for reading/writing documents in the ANSEL character set"
DESCRIPTION = "Codecs for reading/writing documents in the ANSEL character set."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-ansel-1.0.0-2.1.noarch.rpm"
RPM_HASH = "22562d373edc2659e8754469a85fe176b237369bc406b15d02682aabed78785ef82b62628d31d7caa091496fdd9b45aecbde0376bf4a4a7dd907c90bc964d044"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ansel) \
python311-ansel \
python3dist(ansel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
