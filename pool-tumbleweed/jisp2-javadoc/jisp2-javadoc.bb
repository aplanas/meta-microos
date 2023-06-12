SUMMARY = "The Java Indexed Serialization Package"
DESCRIPTION = "Jisp uses B-Tree and hash indexes for keyed access to variable-length \
serialized objects stored in files."
LICENSE = "Libpng"

PV = "2.5.1"

RPM_NAME = "jisp2-javadoc-2.5.1-28.5.noarch.rpm"
RPM_HASH = "ebc315230bd566169685b48aaad476d77b454ad2619b8a97ee86a6c751769877de54021d67bc2acef7263a84ece9f1f81b681ac1174362312e9d67ca1dd612ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jisp2-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
