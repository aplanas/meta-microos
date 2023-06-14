SUMMARY = "YaST2 - iSCSI Client Configuration"
DESCRIPTION = "This package contains the YaST2 component for configuration of an iSCSI \
client."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-iscsi-client-4.6.0-1.1.noarch.rpm"
RPM_HASH = "3bccc122f846a2cbc1e8c4d387c7ba7c7ea0848c4719bcca3e1d0bb589325d8663db53daf2717ca06ea9e9cbf516958bd391f351901696ea4f464f1a26d52723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-iscsi-client"

RDEPENDS:${PN} += "yast2 \
yast2-packager \
yast2-ruby-bindings"

inherit rpm
