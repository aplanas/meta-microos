SUMMARY = "Configuration file loader"
DESCRIPTION = "derpconf abstracts loading configuration files for your app."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python311-derpconf-0.8.3-2.3.noarch.rpm"
RPM_HASH = "01dca6d8178980fe88fa0488a8af63d2c7430d60bfd1273c9bfaeafcec3d4e7edfbd950ef741cf86d3462e7a9934169f36802fcaecf3d5156ca32f595a31d7fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-derpconf \
python3.11dist-derpconf \
python311-derpconf \
python3dist-derpconf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
