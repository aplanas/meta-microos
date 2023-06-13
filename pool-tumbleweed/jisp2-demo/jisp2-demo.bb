SUMMARY = "The Java Indexed Serialization Package"
DESCRIPTION = "Jisp uses B-Tree and hash indexes for keyed access to variable-length \
serialized objects stored in files."
LICENSE = "Libpng"

PV = "2.5.1"

RPM_NAME = "jisp2-demo-2.5.1-28.5.noarch.rpm"
RPM_HASH = "87539b8ea01745cb4451ce5fb7c9194d99b47f43a06ea179a905e1ab6ea6c37df4866b5cd9c2b21475564a147957f726183da21d35598853db4d3b31137c66d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jisp2-demo"

RDEPENDS:${PN} += ""

inherit rpm
