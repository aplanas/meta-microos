SUMMARY = "Configuration file loader"
DESCRIPTION = "derpconf abstracts loading configuration files for your app."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python310-derpconf-0.8.3-2.3.noarch.rpm"
RPM_HASH = "10a4d865148ca29acac0888641c9f910654a3c745893b1b36859e88490f74414cf6d7aba83ddb117c329cf1af0de254de103665192f33ee9f05ddb096484b4fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-derpconf \
python310-derpconf \
python3dist-derpconf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
