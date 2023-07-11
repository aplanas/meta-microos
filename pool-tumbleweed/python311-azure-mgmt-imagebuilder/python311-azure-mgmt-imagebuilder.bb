SUMMARY = "Microsoft Azure Image Builder Client Library"
DESCRIPTION = "This is the Microsoft Azure Image Builder Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-azure-mgmt-imagebuilder-1.2.0-1.2.noarch.rpm"
RPM_HASH = "d45722baa07838e12e37c86ff962307de7169b654067aefc81c49eca048aef3b928c85d090a38ae3f898945303cc26bf119a537cd32f39d80475331f0ea37337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-imagebuilder \
python3.11dist-azure-mgmt-imagebuilder \
python311-azure-mgmt-imagebuilder \
python3dist-azure-mgmt-imagebuilder"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
