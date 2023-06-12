SUMMARY = "Importing Python modules by physical file path"
DESCRIPTION = "Importing Python modules by physical file path."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python310-magicalimport-0.9.1-2.8.noarch.rpm"
RPM_HASH = "1564ebdd5ced7d707e6c396c86e47731e11d8f85bc701eeeeb95d877be7b8744e5d0c4d200248cc7ee0a912a599afa09b6580278d3355b5bc2cde144bf2b3ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magicalimport \
python3.10dist(magicalimport) \
python310-magicalimport \
python3dist(magicalimport)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
