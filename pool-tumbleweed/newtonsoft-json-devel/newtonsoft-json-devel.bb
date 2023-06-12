SUMMARY = "Development files for JSON.net"
DESCRIPTION = "Newtonsoft.Json aka Json.NET is a JSON framework."
LICENSE = "MIT & BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "newtonsoft-json-devel-7.0.1-3.19.noarch.rpm"
RPM_HASH = "e5dee5ddaa5b9447560d99023fa9e9d5293ef6659726115ee17646b14af21ce43259c6c6e312391e5fc51c6125a995fd57d215512105fcf6c74b7fffe787af20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "newtonsoft-json-devel \
pkgconfig(newtonsoft-json)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
newtonsoft-json"

inherit rpm
