SUMMARY = "A declarative way to read and write binary file formats"
DESCRIPTION = "BinData is a declarative way to read and write binary file formats. \
This means the programmer specifies *what* the format of the binary \
data is, and BinData works out *how* to read and write data in this \
format.  It is an easier ( and more readable ) alternative to \
ruby's #pack and #unpack methods."
LICENSE = "Ruby"

PV = "2.4.14"

RPM_NAME = "ruby3.2-rubygem-bindata-2.4.14-1.3.aarch64.rpm"
RPM_HASH = "a6145682825e5eba9d16be860d74acbae48a78631134d46bd376749312702985e7b76cd611dea93d23344ad048ac44df69d598c165a71666b8abce7dcf0c6492"

RPROVIDES:${PN} += "ruby3.2-rubygem-bindata \
ruby3.2-rubygem-bindata(aarch-64) \
rubygem(bindata) \
rubygem(ruby:3.2.0:bindata) \
rubygem(ruby:3.2.0:bindata:2) \
rubygem(ruby:3.2.0:bindata:2.4) \
rubygem(ruby:3.2.0:bindata:2.4.14)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
